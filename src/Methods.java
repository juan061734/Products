
import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

    static Scanner entrada = new Scanner(System.in);
    // declarar la lista o arraylist que contiene y almace objetos de manera
    // dinamica
    static ArrayList<Products> product = new ArrayList<>();
    // Metodo para leer los productos ingresados

    public static void Leerproducts() {
        // definir variables

        String nombre, descripcion;
        double precio;
        int stock, id, numeroproductos;
        boolean habilitado = true;
        // Ingresar los datos del producto

        System.out.println("ingrese la cantidad de productos a ingresar");
        numeroproductos = entrada.nextInt();
        // recorrer el numeroproductos a ingresar
        for (int i = 1; i <= numeroproductos; i++) {
            System.out.println("Producto #" + i);
            System.out.println("Ingrese el identificador");
            id = entrada.nextInt();
            System.out.println("Nombre Producto");
            nombre = entrada.next();
            System.out.println("Valor Producto");
            precio = entrada.nextDouble();
            System.out.println("Cantidad");
            stock = entrada.nextInt();
            System.out.println("Descripcion");
            descripcion = entrada.next();
            // crear instacia del objeto de la clase Products y almacenar los atributos
            Products products = new Products();
            // Mandar la informacion ingresada (TECLADO) por el usuario a la clase Products
            products.setNombre(nombre);
            products.setPrecio(precio);
            products.setStock(stock);
            products.setDescripcion(descripcion);
            products.setId(id);
            products.setHabilitado(habilitado);
            product.add(products);
        }

    }

    public static void GetListarElementos() {
        // Recorrer la lista product para obtener el atributo de su (posicion actual
        // "i")
        for (int i = 0; i < product.size(); i++) {
            System.out.println("Producto #" + i);
            // Mostrar por consola la posicion y el atributo del producto de la lista
            // product
            System.out.println(product.get(i).getId());
            System.out.println(product.get(i).getNombre());
            System.out.println(product.get(i).getPrecio());
            System.out.println(product.get(i).getStock());
            System.out.println(product.get(i).getDescripcion());

        }

    }

    public static void GetBuscarElementoId() {
        // solicitar el id del product a buscar

        System.out.println("ingrese el id del producto a buscar");
        int id = entrada.nextInt();
        // recorrer el tamaño de la lista y su posicion
        for (int i = 0; i < product.size(); i++) {
            if (product.get(i).getId() == id) {
                System.out.println("Nombre: " + product.get(i).getNombre());
                System.out.println("Precio: " + product.get(i).getPrecio());
                System.out.println("Cantidad: " + product.get(i).getStock());
                System.out.println("Descripcion: " + product.get(i).getDescripcion());

            }
        }
    }

    public static void ActualizarProductoId() {
        System.out.println("Ingrese el Id del producto que deseas actualizar");
        int id = entrada.nextInt();
        // recorrer el tamaño de la lista y su posicion

        for (int i = 0; i < product.size(); i++) {
            // validar que el Id que registrado exista
            if (product.get(i).getId() == id) {
                // mostrar los datos del id encontrado
                System.out.println("Nombre: " + product.get(i).getNombre());
                System.out.println("Precio: " + product.get(i).getPrecio());
                System.out.println("Cantidad: " + product.get(i).getStock());
                System.out.println("Descripción: " + product.get(i).getDescripcion());
                System.out.println("******************************************");
                // menu de opciones
                System.out.println("Ingrese el dato que deseas actualizar:");
                System.out.println("1. Nombre");
                System.out.println("2. Precio");
                System.out.println("3. Cantidad");
                System.out.println("4. Descripción");
                System.out.println("5. Todo");
                int opcion = entrada.nextInt();
                // Condicion
                if (opcion == 1) {
                    // ingresar el nuevo dato
                    System.out.println("Nuevo nombre:");
                    String nuevoNombre = entrada.next();
                    // Validar el atributo en su posicion actual y mandar el dato nuevo al Set para
                    // actualizarlo
                    product.get(i).setNombre(nuevoNombre);
                } else if (opcion == 2) {
                    System.out.println("Nuevo precio:");
                    double nuevoPrecio = entrada.nextDouble();
                    product.get(i).setPrecio(nuevoPrecio);
                } else if (opcion == 3) {
                    System.out.println("Nueva cantidad:");
                    int nuevaCantidad = entrada.nextInt();
                    product.get(i).setStock(nuevaCantidad);
                } else if (opcion == 4) {
                    System.out.println("Nueva descripción:");
                    String nuevaDescripcion = entrada.next();
                    product.get(i).setDescripcion(nuevaDescripcion);
                } else if (opcion == 5) {
                    System.out.println("Todos los datos");
                    System.out.println("Ingrese el nuevo nombre:");
                    String nuevoNombre = entrada.next();
                    product.get(i).setNombre(nuevoNombre);
                    System.out.println("Ingrese el nuevo precio:");
                    double nuevoPrecio = entrada.nextDouble();
                    product.get(i).setPrecio(nuevoPrecio);
                    System.out.println("Ingrese la nueva cantidad:");
                    int nuevaCantidad = entrada.nextInt();
                    product.get(i).setStock(nuevaCantidad);
                    System.out.println("Ingrese la nueva descripción:");
                    String nuevaDescripcion = entrada.next();
                    product.get(i).setDescripcion(nuevaDescripcion);
                } else {
                    System.out.println("Opción no válida");
                }
            }
        }
        // retornar al menú
        return;
    }

    public static void CambiarEstadoById() {
        System.out.println("Ingrese el id del producto que deseas eliminar");
        int id = entrada.nextInt();
        // recorrer el tamaño de la lista y su posicion

        for (int i = 0; i < product.size(); i++) {
            // buscar el identificador a eliminar
            if (product.get(i).getId() == id) {
                // Cambiar el estaod del producto
                if (product.get(i).isHabilitado()) {
                    product.get(i).setHabilitado(false);
                } else {
                    product.get(i).setHabilitado(true);
                }

            } else {
                // dato no encontrado
                System.out.println("Producto no encontrado");

            }
        }

    }

    public static void main(String[] args) {
        int opcion = 0;

        do {
            // menu de opciones
            System.out.println("Menú:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar Todos los productos");
            System.out.println("3. Buscar producto por ID");
            System.out.println("4. Actualizar producto");
            System.out.println("5. Eliminar");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                // llamar los metodos en un menú
                Leerproducts();
            } else if (opcion == 2) {
                GetListarElementos();
            } else if (opcion == 3) {
                GetBuscarElementoId();
            } else if (opcion == 4) {
                ActualizarProductoId();
            } else if (opcion == 5) {
                CambiarEstadoById();
            } else if (opcion == 6) {
                System.out.println("Saliendo del menú...");
            } else {
                System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
        } while (opcion != 6);
    }

}
