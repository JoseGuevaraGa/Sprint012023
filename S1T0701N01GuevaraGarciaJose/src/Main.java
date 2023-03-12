public class Main {
    public static void main(String[] args) {
        final double TARIFAPLA=35;


        double sueldo = 0;
        int horasTrabajadas = 0;
        Treballador empleado1 = new Treballador();
        horasTrabajadas=20;
        Treballador.setPrecioHora(15);
        Treballador.setNombre("Maria");
        Treballador.setApellido("Tous");

        sueldo=empleado1.CalcularSueldo(horasTrabajadas);

        System.out.println("Sueldo Trabajador ");
        System.out.println("Nombre empleado   : " + Treballador.getNombre());
        System.out.println("Apellido empleado : " + Treballador.getApellido());
        System.out.println("Horas trabajadas  : " + horasTrabajadas);
        System.out.println("Precio por hora   : " + Treballador.getPrecioHora());
        System.out.println("Sueldo empleado   : " + sueldo);
        System.out.println("--------------------------------------------------");
        System.out.println("Sueldo Trabajador Presencial ");
        TreballadorPresencial empleadoP1 = new TreballadorPresencial();
        horasTrabajadas=20;
        TreballadorPresencial.setPrecioHora(15);
        TreballadorPresencial.setNombre("Laura");
        TreballadorPresencial.setApellido("Martinez");
        sueldo= empleadoP1.CalcularSueldo(horasTrabajadas);
        System.out.println("Nombre empleado   : " + TreballadorPresencial.getNombre());
        System.out.println("Apellido empleado : " + TreballadorPresencial.getApellido());
        System.out.println("Horas trabajadas  : " + horasTrabajadas);
        System.out.println("Precio por hora   : " + TreballadorPresencial.getPrecioHora());
        System.out.println("Plus gasolina     : " + TreballadorPresencial.getBenzina());
        System.out.println("Sueldo empleado   : " + sueldo);

        /*
        @SuppressWarnings("unused") TreballadorPresencial.retornarNombre() {
        }*/
        int sueldoTest=500;
        @SuppressWarnings("deprecation")
        int sueldoEmpleado = empleadoP1.SumaSueldo(sueldoTest);



        System.out.println("--------------------------------------------------");
        System.out.println("Sueldo Trabajador Online ");
        TreballadorOnline empleadoO1 = new TreballadorOnline();
        horasTrabajadas=20;
        TreballadorOnline.setPrecioHora(15);
        TreballadorOnline.setNombre("Nadia");
        TreballadorOnline.setApellido("Sanz");
        sueldo= empleadoO1.CalcularSueldo(horasTrabajadas);
        System.out.println("Nombre empleado   : " + TreballadorOnline.getNombre());
        System.out.println("Apellido empleado : " + TreballadorOnline.getApellido());
        System.out.println("Horas trabajadas  : " + horasTrabajadas);
        System.out.println("Precio por hora   : " + TreballadorOnline.getPrecioHora());
        System.out.println("Plus Internet     : " + TARIFAPLA);
        System.out.println("Sueldo empleado   : " + sueldo);

        int horaTest=12;
        @SuppressWarnings("deprecation")
        int horasEmpleado = empleadoO1.SumaHoras(horaTest);

    }

}