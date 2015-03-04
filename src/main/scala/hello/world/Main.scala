package hello.world

import simplefx.all._
import simplefx.core._

object Main extends App
@SimpleFXApp class Main {                                                // Note: the date automatically
  root = new Label { text <-- ("Hello SimpleFX! Today is the " + date) } // updates, because of
}                                                                        // the binding-operator.
