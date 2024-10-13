package xyz.milesync.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MileSyncApplication

fun main(args: Array<String>) {
	runApplication<MileSyncApplication>(*args)
}
