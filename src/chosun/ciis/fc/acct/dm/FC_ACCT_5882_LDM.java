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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_5882_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fisc_ym_fr;
	public String fisc_ym_to;

	public FC_ACCT_5882_LDM(){}
	public FC_ACCT_5882_LDM(String cmpy_cd, String fisc_ym_fr, String fisc_ym_to){
		this.cmpy_cd = cmpy_cd;
		this.fisc_ym_fr = fisc_ym_fr;
		this.fisc_ym_to = fisc_ym_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFisc_ym_fr(String fisc_ym_fr){
		this.fisc_ym_fr = fisc_ym_fr;
	}

	public void setFisc_ym_to(String fisc_ym_to){
		this.fisc_ym_to = fisc_ym_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFisc_ym_fr(){
		return this.fisc_ym_fr;
	}

	public String getFisc_ym_to(){
		return this.fisc_ym_to;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5882_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5882_LDM dm = (FC_ACCT_5882_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fisc_ym_fr);
		cstmt.setString(5, dm.fisc_ym_to);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5882_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("fisc_ym_fr = " + getFisc_ym_fr());
        System.out.println("fisc_ym_to = " + getFisc_ym_to());
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
String fisc_ym_fr = req.getParameter("fisc_ym_fr");
if( fisc_ym_fr == null){
	System.out.println(this.toString+" : fisc_ym_fr is null" );
}else{
	System.out.println(this.toString+" : fisc_ym_fr is "+fisc_ym_fr );
}
String fisc_ym_to = req.getParameter("fisc_ym_to");
if( fisc_ym_to == null){
	System.out.println(this.toString+" : fisc_ym_to is null" );
}else{
	System.out.println(this.toString+" : fisc_ym_to is "+fisc_ym_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fisc_ym_fr = Util.checkString(req.getParameter("fisc_ym_fr"));
String fisc_ym_to = Util.checkString(req.getParameter("fisc_ym_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fisc_ym_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_ym_fr")));
String fisc_ym_to = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_ym_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setFisc_ym_fr(fisc_ym_fr);
dm.setFisc_ym_to(fisc_ym_to);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 11 14:31:49 KST 2009 */