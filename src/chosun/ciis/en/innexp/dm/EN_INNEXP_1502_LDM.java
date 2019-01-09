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


package chosun.ciis.en.innexp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.ds.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_1502_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt_fr_t2;
	public String occr_dt_to_t2;

	public EN_INNEXP_1502_LDM(){}
	public EN_INNEXP_1502_LDM(String cmpy_cd, String occr_dt_fr_t2, String occr_dt_to_t2){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt_fr_t2 = occr_dt_fr_t2;
		this.occr_dt_to_t2 = occr_dt_to_t2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt_fr_t2(String occr_dt_fr_t2){
		this.occr_dt_fr_t2 = occr_dt_fr_t2;
	}

	public void setOccr_dt_to_t2(String occr_dt_to_t2){
		this.occr_dt_to_t2 = occr_dt_to_t2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt_fr_t2(){
		return this.occr_dt_fr_t2;
	}

	public String getOccr_dt_to_t2(){
		return this.occr_dt_to_t2;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_1502_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_1502_LDM dm = (EN_INNEXP_1502_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt_fr_t2);
		cstmt.setString(5, dm.occr_dt_to_t2);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_1502_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt_fr_t2 = [" + getOccr_dt_fr_t2() + "]");
		System.out.println("occr_dt_to_t2 = [" + getOccr_dt_to_t2() + "]");
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
String occr_dt_fr_t2 = req.getParameter("occr_dt_fr_t2");
if( occr_dt_fr_t2 == null){
	System.out.println(this.toString+" : occr_dt_fr_t2 is null" );
}else{
	System.out.println(this.toString+" : occr_dt_fr_t2 is "+occr_dt_fr_t2 );
}
String occr_dt_to_t2 = req.getParameter("occr_dt_to_t2");
if( occr_dt_to_t2 == null){
	System.out.println(this.toString+" : occr_dt_to_t2 is null" );
}else{
	System.out.println(this.toString+" : occr_dt_to_t2 is "+occr_dt_to_t2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt_fr_t2 = Util.checkString(req.getParameter("occr_dt_fr_t2"));
String occr_dt_to_t2 = Util.checkString(req.getParameter("occr_dt_to_t2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt_fr_t2 = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_fr_t2")));
String occr_dt_to_t2 = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_to_t2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt_fr_t2(occr_dt_fr_t2);
dm.setOccr_dt_to_t2(occr_dt_to_t2);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 24 09:48:07 KST 2009 */