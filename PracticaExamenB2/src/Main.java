public class Main {
    public static void main(String[] args){

        EmpleadoB gerente = new Gerente("Tocino", "G001", 160);
        EmpleadoB desarrollador = new Desarrollador("Bob", "D001", 160);



        EmpleadoDB db = new EmpleadoDB();


        EmpleadoB[] empleados = {gerente, desarrollador};

        for (EmpleadoB empleado : empleados) {
            db.guardarEmpleado(empleado);
        }
        System.out.println("Empleados guardados en la base de datos:");
        db.mostrarEmpleados();

    }
}