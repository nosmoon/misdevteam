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


package chosun.ciis.as.leas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.ds.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1206_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clam_yymm;
	public String clam_seq;

	public AS_LEAS_1206_DDM(){}
	public AS_LEAS_1206_DDM(String cmpy_cd, String clam_yymm, String clam_seq){
		this.cmpy_cd = cmpy_cd;
		this.clam_yymm = clam_yymm;
		this.clam_seq = clam_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClam_yymm(String clam_yymm){
		this.clam_yymm = clam_yymm;
	}

	public void setClam_seq(String clam_seq){
		this.clam_seq = clam_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClam_yymm(){
		return this.clam_yymm;
	}

	public String getClam_seq(){
		return this.clam_seq;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAS_1206_D(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAS_1206_DDM dm = (AS_LEAS_1206_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clam_yymm);
		cstmt.setString(5, dm.clam_seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.leas.ds.AS_LEAS_1206_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clam_yymm = [" + getClam_yymm() + "]");
		System.out.println("clam_seq = [" + getClam_seq() + "]");
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
String clam_yymm = req.getParameter("clam_yymm");
if( clam_yymm == null){
	System.out.println(this.toString+" : clam_yymm is null" );
}else{
	System.out.println(this.toString+" : clam_yymm is "+clam_yymm );
}
String clam_seq = req.getParameter("clam_seq");
if( clam_seq == null){
	System.out.println(this.toString+" : clam_seq is null" );
}else{
	System.out.println(this.toString+" : clam_seq is "+clam_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clam_yymm = Util.checkString(req.getParameter("clam_yymm"));
String clam_seq = Util.checkString(req.getParameter("clam_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clam_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_yymm")));
String clam_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setClam_yymm(clam_yymm);
dm.setClam_seq(clam_seq);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 21 11:01:22 KST 2009 */