
# KrugerBackEnd

Aplicacion Creada con JPA e hibernate para la creacion de base de datos en postgresql contiene principios de inyección de dependencia y servicio Rest
la aplicación cuenta con cuatro paquetes los cuales describiremos a continuación.
1.-com.kruger.challanger.entity.- En este paquete creamos las Clases Java que representaran a cada una de las tablas en nuestra base de datos, en nuestro caso definimos las clases java Roles y Usuarios, la anotación @column nos permite darnos cuenta cuales son las columnas que se creará en nuestars tablas, a demás la anotación @temporal permite ingresar fechas en formato año-mes-dia y como esta relacion es de uno muchos tambien se crea la tabla usuarios user_roles la cual contiene el id de cada usuario y de cada rol esto permitará mas tarde la validación de pasword y usuario para verificar el rol y poder dar permisos de accesos a cada usuario, cabe racalcar que en la appliction.properties se debe poner lo siguiente :
spring.jpa.database=POSTGRESQL
spring.datasource.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/krugerdb
spring.datasource.username=postgres
spring.datasource.password=admin
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create 

Esta configuración nos permite conectarnos a la base de datos y el jpa.hibernate generará el ddl necesario para que crear nuestra base de datos, esta útima linea de configuración es mejor comentarla para que si desplegamos de nuevo la aplicacion no se creen de nuevo las tablas y se pierdan los datos.

2.-com.kruger.challanger.repository.- Aquí crearemos las interfaces de las entidades ya que spring jpa que nos permite utilizar la implementacion que Spring boot nos provee, para esto es necesario realizar un extends de la interfaz a la clase CrudRepositor y tenemos que especificar el tipo de objeto al cual queremos implementar el repositorio en nuestro caso tenemos dos interface de RoleRepository que es de tipo rol, y UsuariosRepository que es de tipo Usuario, tambien hay que notar la importancia de poner la anoacion @Repository para que el la interfaz sea reconocida y sepa que hay que hacer con ella 

3.-com.kruger.challanger.service.- En la parte de servicios contaremos con interfaces y una implementación, esta manera es la mas recomndable para realizar inyeccion de dependencias, permitira al codigo la adaptacion de mejor manera a lagun cambio en la aplicacion, es neesario enfatizar que los metodos que tengamos en la interface es necesario implementarlos en la implementacion del servicio.
En nuestro Caso tenemos la interface UsuarioService y la clase UsuarioServiceImpl la cual realiza un implement de la interface UsuarioService, y aqui vamos a utitlizar el repositorio UserRepository lo usamos con la anotacion @Autowired para retornar los usuarios de acuerdo a cada método que implementemos.

4.-com.kruger.challanger.Controller.-Esta parte nos permitira realizar la expocicion de los servicios creados mediante la utilizacion de las anotaciones @Requestmapping que permite definir la direccion con la cual ingresaremos al servicio, la anotacion @GetMapping que indica que la peticion que le hara al sevidor para ese servicio es de tipo get esto ultimo aun falta desarrollar ya que el tiempo de entrega termino.










