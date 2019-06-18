package startup;

import org.apache.ignite.Ignition;

/** This file was generated by Ignite Web Console (06/17/2019, 19:28) **/
public class ServerNodeSpringStartup {
    /**
     * Start up node with specified configuration.
     * 
     * @param args Command line arguments, none required.
     * @throws Exception If failed.
     **/
    public static void main(String[] args) throws Exception {
        Ignition.start("PAM_TEST_CLUSTER-server.xml");
    }
}