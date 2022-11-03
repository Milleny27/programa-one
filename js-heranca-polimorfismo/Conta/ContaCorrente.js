import { Cliente } from "../Cliente.js";
import { Conta} from "./Conta.js";

export class ContaCorrente extends Conta{
    static numeroDeContas = 0;
   // #saldo =0 https://github.com/tc39/proposal-class-fields#private-fields

    set cliente(novoValor){
        if(novoValor instanceof Cliente){
            this._cliente = novoValor;
        }
    }

    get cliente(){
        return this._cliente;
    }

    get saldo(){
        return this._saldo;
    }

    constructor(cliente, agencia){
        super(0, cliente, agencia);
        ContaCorrente.numeroDeContas += 1;
    }


    sacar(valor){
        const taxa = 1;
        return this._sacar(valor, taxa);
    }

    depositar(valor){
        if(valor <= 0)
        {
            return;
        } 
        this._saldo += valor;           
    }

    tranferir(valor, conta){
        
        const valorSacado = this.sacar(valor);
        conta.depositar(valorSacado);
        
    }
}
