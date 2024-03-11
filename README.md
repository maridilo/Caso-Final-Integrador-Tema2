# Caso-Final-Integrador-Tema2

https://github.com/maridilo/Caso-Final-Integrador-Tema2.git



Diseño y la implementación de un sistema inteligente de gestión de zoológicos. El sistema integra múltiples funciones, incluida la gestión del hábitat, el cuidado de los animales, la interacción con los visitantes, la gestión de recursos y el mantenimiento y la seguridad del zoológico. Se utilizan conceptos de programación orientada a objetos para crear sistemas potentes y flexibles que mejoran la eficiencia operativa y la experiencia de los animales y los visitantes.
Clases:
GestionRecursos:

Atributos:
inventarioAlimentos: Map<String, Alimento>: Almacena los alimentos disponibles en el zoológico.
inventarioMedicinas: Map<String, Medicina>: Almacena las medicinas disponibles en el zoológico.
inventarioEquipamiento: Map<String, Equipamiento>: Almacena el equipamiento disponible en el zoológico.
Métodos:
agregarAlimento(alimento: Alimento): Agrega un alimento al inventario.
agregarMedicina(medicina: Medicina): Agrega una medicina al inventario.
agregarEquipamiento(equipamiento: Equipamiento): Agrega un equipamiento al inventario.
Otros métodos para gestionar inventario, como verificación de existencias, realización de pedidos, etc.
RegistroCuidadoAnimales:

Atributos:
registro: List<RegistroCuidado>: Almacena el registro de cuidado de los animales.
Métodos:
registrarAlimentacion(animal: Animal, alimento: String, cantidad: int): Registra la alimentación de un animal.
Otros métodos para registrar cuidados veterinarios, comportamientos, etc.
QuioscoInteractivo:

Métodos:
mostrarInformacionAnimal(animal: Animal): Muestra información sobre un animal en el quiosco interactivo.
Otros métodos para proporcionar información sobre hábitats, especies, etc.
ProgramadorMantenimiento:

Atributos:
tareasPendientes: List<Mantenimiento>: Almacena las tareas de mantenimiento programadas.
Métodos:
programarMantenimiento(mantenimiento: Mantenimiento): Programa una tarea de mantenimiento.
Otros métodos para gestionar el estado de las tareas, marcar como completadas, etc.
SistemaSeguridad:

Métodos:
monitorearAccesos(): Monitorea los accesos al zoológico.
monitorearMovimientos(): Monitorea los movimientos dentro del zoológico.
Otros métodos para detectar eventos de seguridad, generar alertas, etc.

El módulo de GestionRecursos se encarga de administrar los alimentos, medicinas y equipamiento del zoológico, asegurando un suministro adecuado para el cuidado de los animales y las necesidades operativas.
El módulo de RegistroCuidadoAnimales registra y supervisa el cuidado diario de los animales, incluyendo su alimentación, salud y comportamiento.
El QuioscoInteractivo proporciona información educativa y entretenida a los visitantes sobre los animales, hábitats y actividades del zoológico.
El ProgramadorMantenimiento programa y gestiona las tareas de mantenimiento necesarias para mantener las instalaciones del zoológico en óptimas condiciones.
El SistemaSeguridad monitorea los accesos y movimientos dentro del zoológico para garantizar la seguridad de los animales, el personal y los visitantes.
