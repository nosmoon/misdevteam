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


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_1302_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String matr_cd_fr;
	public String matr_cd_to;

	public MT_COMMATR_1302_LDM(){}
	public MT_COMMATR_1302_LDM(String cmpy_cd, String matr_cd_fr, String matr_cd_to){
		this.cmpy_cd = cmpy_cd;
		this.matr_cd_fr = matr_cd_fr;
		this.matr_cd_to = matr_cd_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMatr_cd_fr(String matr_cd_fr){
		this.matr_cd_fr = matr_cd_fr;
	}

	public void setMatr_cd_to(String matr_cd_to){
		this.matr_cd_to = matr_cd_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMatr_cd_fr(){
		return this.matr_cd_fr;
	}

	public String getMatr_cd_to(){
		return this.matr_cd_to;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_1302_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_1302_LDM dm = (MT_COMMATR_1302_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.matr_cd_fr);
		cstmt.setString(5, dm.matr_cd_to);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_1302_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("matr_cd_fr = [" + getMatr_cd_fr() + "]");
		System.out.println("matr_cd_to = [" + getMatr_cd_to() + "]");
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
String matr_cd_fr = req.getParameter("matr_cd_fr");
if( matr_cd_fr == null){
	System.out.println(this.toString+" : matr_cd_fr is null" );
}else{
	System.out.println(this.toString+" : matr_cd_fr is "+matr_cd_fr );
}
String matr_cd_to = req.getParameter("matr_cd_to");
if( matr_cd_to == null){
	System.out.println(this.toString+" : matr_cd_to is null" );
}else{
	System.out.println(this.toString+" : matr_cd_to is "+matr_cd_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String matr_cd_fr = Util.checkString(req.getParameter("matr_cd_fr"));
String matr_cd_to = Util.checkString(req.getParameter("matr_cd_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String matr_cd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd_fr")));
String matr_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMatr_cd_fr(matr_cd_fr);
dm.setMatr_cd_to(matr_cd_to);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 02 18:05:14 KST 2009 */