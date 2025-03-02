package com.payroll.payrollSystem

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.apache.juli.logging.Log
import java.util.Objects
import kotlin.concurrent.timer

@Entity
data class Employee (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long? = null,
    private val name : String,
    private var role : String
) {

    @Override
    override fun equals(other: Any?): Boolean {

        if (this === other){
            return true
        }
        if (other !is Employee){
            return false
        }
        other as Employee

       return this.id == other.id && this.name == other.name && this.role == other.role
    }

    @Override
    override fun hashCode(): Int {
        return Objects.hash(this.id, this.name, this.role)
    }

}