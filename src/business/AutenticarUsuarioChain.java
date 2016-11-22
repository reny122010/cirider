package business;
public abstract class AutenticarUsuarioChain {		 
    protected AutenticarUsuarioChain next;
    protected IDAutenticarUsuario identificadorDoAutenticarUsuario;

    public AutenticarUsuarioChain(IDAutenticarUsuario id) {
        next = null;
        identificadorDoAutenticarUsuario = id;
    }

    public void setNext(AutenticarUsuarioChain forma) {
        if (next == null) {
            next = forma;
        } else {
            next.setNext(forma);
        }
    }
    
    public void efetuarAutenticar(IDAutenticarUsuario id) throws Exception {
        if (podeEfetuarAutenticar(id)) {
            efetuaAutenticar();
        } else {
            if (next == null) {
                throw new Exception("Usuario nao autenticado");
            }
            next.efetuarAutenticar(id);
        }
    }
    
    private boolean podeEfetuarAutenticar(IDAutenticarUsuario id) {
        if (identificadorDoAutenticarUsuario == id) {
            return true;
        }
        return false;
    }
    
    protected abstract void efetuaAutenticar();
}
