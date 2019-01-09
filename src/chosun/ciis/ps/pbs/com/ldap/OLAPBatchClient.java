package chosun.ciis.ps.pbs.com.ldap;

public class OLAPBatchClient{
	public static void main(String args[]) {
		OLAPBatchExec exec = new OLAPBatchExec();
		System.out.println(exec.runOLAPBatch());
	}
}
