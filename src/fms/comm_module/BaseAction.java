package fms.comm_module;


public interface BaseAction {
	public int connect(String ip, int port);
	public boolean sendData(String data);
	public byte [] recvData();
	public int close();
}
