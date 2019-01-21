function SwitchButton() {
    this.status = status;
    this.lamp = null; 

    this.connectToLamp = function (electricLamp){
        this.lamp = electricLamp;
    }

    this.switchOff = function() {
        this.lamp.turnOff();
    }

    this.switchOn = function() {
        this.lamp.turnOn()
    }
    
}