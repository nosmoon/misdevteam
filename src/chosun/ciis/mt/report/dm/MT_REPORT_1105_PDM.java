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


package chosun.ciis.mt.report.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.report.ds.*;
import chosun.ciis.mt.report.rec.*;

/**
 * 
 */
 

public class MT_REPORT_1105_PDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mov_inout_dt;

	public MT_REPORT_1105_PDM(){}
	public MT_REPORT_1105_PDM(String cmpy_cd, String mov_inout_dt){
		this.cmpy_cd = cmpy_cd;
		this.mov_inout_dt = mov_inout_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMov_inout_dt(String mov_inout_dt){
		this.mov_inout_dt = mov_inout_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMov_inout_dt(){
		return this.mov_inout_dt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_REPORT_1105_P(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_REPORT_1105_PDM dm = (MT_REPORT_1105_PDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mov_inout_dt);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.report.ds.MT_REPORT_1105_PDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mov_inout_dt = [" + getMov_inout_dt() + "]");
		System.out.println("aaaaaaaa [" + getMov_inout_dt() + "]");
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
String mov_inout_dt = req.getParameter("mov_inout_dt");
if( mov_inout_dt == null){
	System.out.println(this.toString+" : mov_inout_dt is null" );
}else{
	System.out.println(this.toString+" : mov_inout_dt is "+mov_inout_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mov_inout_dt = Util.checkString(req.getParameter("mov_inout_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mov_inout_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_inout_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMov_inout_dt(mov_inout_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jul 31 12:01:55 KST 2009 */