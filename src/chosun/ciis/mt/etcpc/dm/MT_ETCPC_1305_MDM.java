/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mt.etcpc.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.ds.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_1305_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String draft_deptcd;

	public MT_ETCPC_1305_MDM(){}
	public MT_ETCPC_1305_MDM(String cmpy_cd, String draft_deptcd){
		this.cmpy_cd = cmpy_cd;
		this.draft_deptcd = draft_deptcd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDraft_deptcd(String draft_deptcd){
		this.draft_deptcd = draft_deptcd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDraft_deptcd(){
		return this.draft_deptcd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCPC_1305_M(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_1305_MDM dm = (MT_ETCPC_1305_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.draft_deptcd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_1305_MDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("draft_deptcd = " + getDraft_deptcd());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String draft_deptcd = req.getParameter("draft_deptcd");
if( draft_deptcd == null){
	System.out.println(this.toString+" : draft_deptcd is null" );
}else{
	System.out.println(this.toString+" : draft_deptcd is "+draft_deptcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String draft_deptcd = Util.checkString(req.getParameter("draft_deptcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String draft_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_deptcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setDraft_deptcd(draft_deptcd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 18 15:03:20 KST 2009 */