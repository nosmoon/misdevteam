/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_7001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_basi_mm;

	public HD_SALY_7001_LDM(){}
	public HD_SALY_7001_LDM(String cmpy_cd, String aply_basi_mm){
		this.cmpy_cd = cmpy_cd;
		this.aply_basi_mm = aply_basi_mm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_basi_mm(String aply_basi_mm){
		this.aply_basi_mm = aply_basi_mm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_basi_mm(){
		return this.aply_basi_mm;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_7001_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_7001_LDM dm = (HD_SALY_7001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aply_basi_mm);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_7001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aply_basi_mm = [" + getAply_basi_mm() + "]");
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
String aply_basi_mm = req.getParameter("aply_basi_mm");
if( aply_basi_mm == null){
	System.out.println(this.toString+" : aply_basi_mm is null" );
}else{
	System.out.println(this.toString+" : aply_basi_mm is "+aply_basi_mm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_basi_mm = Util.checkString(req.getParameter("aply_basi_mm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_basi_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_basi_mm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setAply_basi_mm(aply_basi_mm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jul 06 14:33:25 KST 2015 */