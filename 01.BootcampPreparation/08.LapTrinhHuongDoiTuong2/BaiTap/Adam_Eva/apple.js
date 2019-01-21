function Apple(weight) {
    this.weight = weight;
    this.getWeight = function() {
        return this.weight;
    }
    
    this.decrease = function () {
        this.weight -= 1;
    }

    this.isEmpty = function() {
        return this.weight == 0;
    }
}