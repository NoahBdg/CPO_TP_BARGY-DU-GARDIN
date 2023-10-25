package lightoff_bargy_du_gardin_version_console;


public class LightOff_BARGY_DU_GARDIN_version_console {
    public static void main(String[] args) {
        CelluleLumineuse cell=new CelluleLumineuse();
        System.out.println(cell.estAllumee);
        cell.allumer();
        System.out.println(cell.estAllumee);
    }
    
}
