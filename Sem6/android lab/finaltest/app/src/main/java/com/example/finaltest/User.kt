package com.example.finaltest

class Donor {
    var name: String? = null
    var email: String? = null
    var uid: String? = null
    var phone: String? = null
    var address: String? = null
    var blgr: String? = null


    constructor() {}

    constructor(name: String?, email: String?, uid: String?, ph: String?, adr: String?, blgr: String?) {
        this.name = name
        this.email = email
        this.uid = uid
        this.phone = ph
        this.address = adr
        this.blgr = blgr
    }

}