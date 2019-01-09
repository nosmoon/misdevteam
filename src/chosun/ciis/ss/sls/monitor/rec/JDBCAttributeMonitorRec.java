package chosun.ciis.ss.sls.monitor.rec;

public class JDBCAttributeMonitorRec extends java.lang.Object implements java.io.Serializable{

	public String poolname;
	public String svrname;
	public int conncurcnt;
	public int connhighcnt;
	public int conntotcnt;
	public int maxcapa;
	public int waitsechigh;
	public int waitforconncur;
	public int waitforconnhigh;
	public String state;

	public JDBCAttributeMonitorRec(){}

	public void setPoolname(String poolname){
		this.poolname = poolname;
	}

	public void setSvrname(String svrname){
		this.svrname = svrname;
	}

	public void setConncurcnt(int conncurcnt){
		this.conncurcnt = conncurcnt;
	}

	public void setConnhighcnt(int connhighcnt){
		this.connhighcnt = connhighcnt;
	}

	public void setConntotcnt(int conntotcnt){
		this.conntotcnt = conntotcnt;
	}

	public void setMaxcapa(int maxcapa){
		this.maxcapa = maxcapa;
	}

	public void setWaitsechigh(int waitsechigh){
		this.waitsechigh = waitsechigh;
	}

	public void setWaitforconncur(int waitforconncur){
		this.waitforconncur = waitforconncur;
	}

	public void setWaitforconnhigh(int waitforconnhigh){
		this.waitforconnhigh = waitforconnhigh;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getPoolname(){
		return this.poolname;
	}

	public String getSvrname(){
		return this.svrname;
	}

	public int getConncurcnt(){
		return this.conncurcnt;
	}

	public int getConnhighcnt(){
		return this.connhighcnt;
	}

	public int getConntotcnt(){
		return this.conntotcnt;
	}

	public int getMaxcapa(){
		return this.maxcapa;
	}

	public int getWaitsechigh(){
		return this.waitsechigh;
	}

	public int getWaitforconncur(){
		return this.waitforconncur;
	}

	public int getWaitforconnhigh(){
		return this.waitforconnhigh;
	}

	public String getState(){
		return this.state;
	}

}
