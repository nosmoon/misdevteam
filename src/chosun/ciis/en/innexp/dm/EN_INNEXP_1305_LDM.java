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


public class EN_INNEXP_1305_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clos_dt_fr;
	public String clos_dt_to;

	public EN_INNEXP_1305_LDM(){}
	public EN_INNEXP_1305_LDM(String cmpy_cd, String clos_dt_fr, String clos_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.clos_dt_fr = clos_dt_fr;
		this.clos_dt_to = clos_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_dt_fr(String clos_dt_fr){
		this.clos_dt_fr = clos_dt_fr;
	}

	public void setClos_dt_to(String clos_dt_to){
		this.clos_dt_to = clos_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClos_dt_fr(){
		return this.clos_dt_fr;
	}

	public String getClos_dt_to(){
		return this.clos_dt_to;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_1305_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_1305_LDM dm = (EN_INNEXP_1305_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clos_dt_fr);
		cstmt.setString(5, dm.clos_dt_to);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_1305_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clos_dt_fr = [" + getClos_dt_fr() + "]");
		System.out.println("clos_dt_to = [" + getClos_dt_to() + "]");
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
String clos_dt_fr = req.getParameter("clos_dt_fr");
if( clos_dt_fr == null){
	System.out.println(this.toString+" : clos_dt_fr is null" );
}else{
	System.out.println(this.toString+" : clos_dt_fr is "+clos_dt_fr );
}
String clos_dt_to = req.getParameter("clos_dt_to");
if( clos_dt_to == null){
	System.out.println(this.toString+" : clos_dt_to is null" );
}else{
	System.out.println(this.toString+" : clos_dt_to is "+clos_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clos_dt_fr = Util.checkString(req.getParameter("clos_dt_fr"));
String clos_dt_to = Util.checkString(req.getParameter("clos_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clos_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_dt_fr")));
String clos_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setClos_dt_fr(clos_dt_fr);
dm.setClos_dt_to(clos_dt_to);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Sep 20 11:08:22 KST 2010 */