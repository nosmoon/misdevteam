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


public class FC_FUNC_1081_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mtry_dt;
	public String chkpjee;
	public String place;

	public FC_FUNC_1081_LDM(){}
	public FC_FUNC_1081_LDM(String cmpy_cd, String mtry_dt, String chkpjee, String place){
		this.cmpy_cd = cmpy_cd;
		this.mtry_dt = mtry_dt;
		this.chkpjee = chkpjee;
		this.place = place;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setChkpjee(String chkpjee){
		this.chkpjee = chkpjee;
	}

	public void setPlace(String place){
		this.place = place;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getChkpjee(){
		return this.chkpjee;
	}

	public String getPlace(){
		return this.place;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1081_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1081_LDM dm = (FC_FUNC_1081_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mtry_dt);
		cstmt.setString(5, dm.chkpjee);
		cstmt.setString(6, dm.place);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1081_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("chkpjee = [" + getChkpjee() + "]");
		System.out.println("place = [" + getPlace() + "]");
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
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String chkpjee = req.getParameter("chkpjee");
if( chkpjee == null){
	System.out.println(this.toString+" : chkpjee is null" );
}else{
	System.out.println(this.toString+" : chkpjee is "+chkpjee );
}
String place = req.getParameter("place");
if( place == null){
	System.out.println(this.toString+" : place is null" );
}else{
	System.out.println(this.toString+" : place is "+place );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String chkpjee = Util.checkString(req.getParameter("chkpjee"));
String place = Util.checkString(req.getParameter("place"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String chkpjee = Util.Uni2Ksc(Util.checkString(req.getParameter("chkpjee")));
String place = Util.Uni2Ksc(Util.checkString(req.getParameter("place")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMtry_dt(mtry_dt);
dm.setChkpjee(chkpjee);
dm.setPlace(place);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Aug 18 17:51:44 KST 2009 */