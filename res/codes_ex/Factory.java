//Intègre le design pattern Factory à cette classe d'une mauvaise façon

public class Factory {
        
        private static Factory instance = null;
    
        private Factory() {
        }
    
        public static Factory getInstance() {
            if (instance == null) {
                instance = new Factory();
            }
            return instance;
        }
    
        public SimpleClass getSimpleClass() {
            return new SimpleClass();
        }    
}
