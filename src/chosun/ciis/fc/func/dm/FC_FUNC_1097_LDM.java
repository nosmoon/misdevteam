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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1097_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String repl_dt;

	public FC_FUNC_1097_LDM(){}
	public FC_FUNC_1097_LDM(String cmpy_cd, String repl_dt){
		this.cmpy_cd = cmpy_cd;
		this.repl_dt = repl_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRepl_dt(String repl_dt){
		this.repl_dt = repl_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRepl_dt(){
		return this.repl_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1097_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1097_LDM dm = (FC_FUNC_1097_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.repl_dt);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1097_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("repl_dt = " + getRepl_dt());
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
String repl_dt = req.getParameter("repl_dt");
if( repl_dt == null){
	System.out.println(this.toString+" : repl_dt is null" );
}else{
	System.out.println(this.toString+" : repl_dt is "+repl_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String repl_dt = Util.checkString(req.getParameter("repl_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String repl_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("repl_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setRepl_dt(repl_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Feb 20 10:57:54 KST 2009 */