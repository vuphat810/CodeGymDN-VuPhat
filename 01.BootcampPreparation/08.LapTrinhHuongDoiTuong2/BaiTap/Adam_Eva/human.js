function Human(name, gender, weight) {
    this.name = name;
    this.gender = gender;
    this.weight = weight;

    this.getName = function () {
        return this.name;
    }

    this.setName = function (name) {
        this.name = name;
    }

    this.getWeight = function () {
        return this.weight;
    }
    this.setWeight = function (weight) {
        this.weight = weight;
    }

    this.isMale = function () {
        return this.gender;
    
    }
    this.setGender = function (gender) {
        this.gender = gender;
    }

    this.checkApple = function (apple) {
        return !apple.isEmpty();
    }

    this.eat = function (apple) {
        if (this.checkApple(apple));
        apple.decrease();
        this.weight++;
    }

    this.say = function (content) {
        console.log(content);
    }
}
