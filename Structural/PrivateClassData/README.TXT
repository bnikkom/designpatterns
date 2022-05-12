Private Class Data
R-estricts accessor/mutator access

Intent
-Control write access to class attributes
-Separate data from methods that use it
-Encapsulate class data initialization
-Providing new type of final - final after constructor

Check list
-Create data class. Move to data class all attributes that need hiding.
-Create in main class instance of data class.
-Main class must initialize data class through the data class's constructor.
-Expose each attribute (variable or property) of data class through a getter.
-Expose each attribute that will change in further through a setter.
