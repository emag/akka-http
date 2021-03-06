/*
 * Copyright (C) 2009-2018 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.http.javadsl.settings;

import akka.actor.ActorSystem;
import org.junit.Test;
import org.scalatest.junit.JUnitSuite;

public class ClientConnectionSettingsTest extends JUnitSuite {

    @Test
    public void testCreateWithActorSystem() {
        ActorSystem sys = ActorSystem.create("test");
        ClientConnectionSettings settings = ClientConnectionSettings.create(sys);
    }
}
