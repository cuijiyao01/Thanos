package zookeeper;

import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.ZkClient;

/**
 * @Author i531869
 * @Date 6/17/21 7:47 PM
 * @Version 1.0
 */
public class ZKConnect {
  private static final String IP_PORT = "127.0.0.1:2181";
  private static final String Z_NODE = "/LOCK";

  public static void main(String[] args) {
    ZkClient zkClient = new ZkClient(IP_PORT);
    // IZkChildListener
    zkClient.createEphemeralSequential(Z_NODE + "/", "lock");
    // System.out.println("=========");
    // zkClient.delete()
    // zkClient.deleteRecursive("/LOCK0000000023");
  }
}
