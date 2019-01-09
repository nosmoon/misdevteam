
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


package chosun.ciis.hd.dalon.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dalon.ds.*;
import chosun.ciis.hd.dalon.rec.*;

/**
 * 
 */


public class HD_DALON_1401_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aplc_clsf;
	public String session_dept_cd;

	public HD_DALON_1401_LDM(){}
	public HD_DALON_1401_LDM(String cmpy_cd, String aplc_clsf, String session_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.aplc_clsf = aplc_clsf;
		this.session_dept_cd = session_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAplc_clsf(String aplc_clsf){
		this.aplc_clsf = aplc_clsf;
	}

	public void setSession_dept_cd(String session_dept_cd){
		this.session_dept_cd = session_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAplc_clsf(){
		return this.aplc_clsf;
	}

	public String getSession_dept_cd(){
		return this.session_dept_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DALON_1401_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DALON_1401_LDM dm = (HD_DALON_1401_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aplc_clsf);
		cstmt.setString(5, dm.session_dept_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.dalon.ds.HD_DALON_1401_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aplc_clsf = [" + getAplc_clsf() + "]");
		System.out.println("session_dept_cd = [" + getSession_dept_cd() + "]");
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
String aplc_clsf = req.getParameter("aplc_clsf");
if( aplc_clsf == null){
	System.out.println(this.toString+" : aplc_clsf is null" );
}else{
	System.out.println(this.toString+" : aplc_clsf is "+aplc_clsf );
}
String session_dept_cd = req.getParameter("session_dept_cd");
if( session_dept_cd == null){
	System.out.println(this.toString+" : session_dept_cd is null" );
}else{
	System.out.println(this.toString+" : session_dept_cd is "+session_dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aplc_clsf = Util.checkString(req.getParameter("aplc_clsf"));
String session_dept_cd = Util.checkString(req.getParameter("session_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aplc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_clsf")));
String session_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("session_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setAplc_clsf(aplc_clsf);
dm.setSession_dept_cd(session_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 14 16:13:42 KST 2009 */