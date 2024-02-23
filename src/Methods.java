
import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Products> product = new ArrayList<>();

    public static void Leerproducts() {
        String nombre, descripcion;
        double precio;
        int stock, id, numeroproductos;
        boolean habilitado = true;

        System.out.println("ingrese la cantidad de productos a ingresar");
        numeroproductos = entrada.nextInt();
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

            Products products = new Products();
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
        for (int i = 0; i < product.size(); i++) {
            System.out.println("Producto #" + i);
            System.out.println(product.get(i).getId());
            System.out.println(product.get(i).getNombre());
            System.out.println(product.get(i).getPrecio());
            System.out.println(product.get(i).getStock());
            System.out.println(product.get(i).getDescripcion());

        }

    }

    public static void GetBuscarElementoId() {
        System.out.println("ingrese el id del producto a buscar");
        int id = entrada.nextInt();
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

        for (int i = 0; i < product.size(); i++) {
            if (product.get(i).getId() == id) {

                System.out.println("Nombre: " + product.get(i).getNombre());
                System.out.println("Precio: " + product.get(i).getPrecio());
                System.out.println("Cantidad: " + product.get(i).getStock());
                System.out.println("Descripción: " + product.get(i).getDescripcion());
                System.out.println("******************************************");

                System.out.println("Ingrese el dato que deseas actualizar:");
                System.out.println("1. Nombre");
                System.out.println("2. Precio");
                System.out.println("3. Cantidad");
                System.out.println("4. Descripción");
                System.out.println("5. Todo");
                int opcion = entrada.nextInt();

                if (opcion == 1) {
                    System.out.println("Nuevo nombre:");
                    String nuevoNombre = entrada.next();
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

        return;
    }

    public static void CambiarEstadoById() {
        System.out.println("Ingrese el id del producto que deseas eliminar");
        int id = entrada.nextInt();
        for (int i = 0; i < product.size(); i++) {
            if (product.get(i).getId() == id) {
                if (product.get(i).isHabilitado()) {
                    product.get(i).setHabilitado(false);
                } else {
                    product.get(i).setHabilitado(true);
                }

            } else {
                System.out.println("Producto no encontrado");

            }
        }

    }

    public static void main(String[] args) {
        int opcion = 0;

        do {
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
