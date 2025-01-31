class Voice2 {
    Animal[] prepareVoice() {
        Animal[] animal = new Animal[5];
        animal[0] = new Cow();
        animal[1] = new Goat();
        animal[2] = new Pig();
        animal[3] = new Lion();
        animal[4] = new Tiger();
    }
    
    void hear(Animal[] animal) {
        for (int i = 0; i < 5; i++) {
            animal[i].makeVoice();
        } 
    }
    
    void templateMethod() {
        Animal[] animal = prepareVoice();
	hear(animal);
    }
}