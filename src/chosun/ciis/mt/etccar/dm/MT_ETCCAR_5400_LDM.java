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


package chosun.ciis.mt.etccar.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.ds.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_5400_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String buy_dt_fr;
	public String buy_dt_to;
	public String car_no;

	public MT_ETCCAR_5400_LDM(){}
	public MT_ETCCAR_5400_LDM(String cmpy_cd, String buy_dt_fr, String buy_dt_to, String car_no){
		this.cmpy_cd = cmpy_cd;
		this.buy_dt_fr = buy_dt_fr;
		this.buy_dt_to = buy_dt_to;
		this.car_no = car_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBuy_dt_fr(String buy_dt_fr){
		this.buy_dt_fr = buy_dt_fr;
	}

	public void setBuy_dt_to(String buy_dt_to){
		this.buy_dt_to = buy_dt_to;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBuy_dt_fr(){
		return this.buy_dt_fr;
	}

	public String getBuy_dt_to(){
		return this.buy_dt_to;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_5400_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_5400_LDM dm = (MT_ETCCAR_5400_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.buy_dt_fr);
		cstmt.setString(5, dm.buy_dt_to);
		cstmt.setString(6, dm.car_no);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_5400_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("buy_dt_fr = [" + getBuy_dt_fr() + "]");
		System.out.println("buy_dt_to = [" + getBuy_dt_to() + "]");
		System.out.println("car_no = [" + getCar_no() + "]");
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
String buy_dt_fr = req.getParameter("buy_dt_fr");
if( buy_dt_fr == null){
	System.out.println(this.toString+" : buy_dt_fr is null" );
}else{
	System.out.println(this.toString+" : buy_dt_fr is "+buy_dt_fr );
}
String buy_dt_to = req.getParameter("buy_dt_to");
if( buy_dt_to == null){
	System.out.println(this.toString+" : buy_dt_to is null" );
}else{
	System.out.println(this.toString+" : buy_dt_to is "+buy_dt_to );
}
String car_no = req.getParameter("car_no");
if( car_no == null){
	System.out.println(this.toString+" : car_no is null" );
}else{
	System.out.println(this.toString+" : car_no is "+car_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String buy_dt_fr = Util.checkString(req.getParameter("buy_dt_fr"));
String buy_dt_to = Util.checkString(req.getParameter("buy_dt_to"));
String car_no = Util.checkString(req.getParameter("car_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String buy_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_dt_fr")));
String buy_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("buy_dt_to")));
String car_no = Util.Uni2Ksc(Util.checkString(req.getParameter("car_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setBuy_dt_fr(buy_dt_fr);
dm.setBuy_dt_to(buy_dt_to);
dm.setCar_no(car_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 24 10:19:13 KST 2009 */