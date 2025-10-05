## Descripción del diagrama de clases. ## 
En nuestro diagrama representamos las entidades fundamentales en el modelado del trabajo. La estructura parte de una clase abstracta **Usuario**, de la cual heredan las clases **Cliente** y **Administrador**, especializando sus responsabilidades.

- **Usuario:** El usuario puede iniciar sesión, cerrar sesión y registrar un usuario. Es la clase *madre* de **Cliente** y **Administrador**
- **Dirección:** Permite vincular al usuario con una ubicación física, lo que es un requisito para gestionar el envío de productos
- **Cliente:** El cliente puede realizar pagos y ver sus carritos. Un cliente puede tener uno o más carritos, y puede realizar uno o más pedidos.
- **Carrito:** La clase Carrito representa el carrito de compras del cliente. En este se pueden agregar productos, modificar su cantidad, eliminarlos e iniciar el proceso de pago. Al iniciar el proceso de pago, se genera un pedido.
- **Pedido:** Un pedido tiene un atributo estado, basado en un enumerado ***ESTADOS*** que representa las distintas etapas del pedido: *Procesando*, *Enviando* y *Cancelado*.
- **Administrador:** Representa al responsable de la tienda, encargado de gestionar los productos disponibles. La clase **Producto** se relaciona mediante agregación con Carrito, permitiendo su inclusión temporal en el proceso de compra.

