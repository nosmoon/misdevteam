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


package chosun.ciis.as.redm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.redm.ds.*;
import chosun.ciis.as.redm.rec.*;

/**
 * 
 */


public class AS_REDM_1304_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String aply_dt;
	public String redm_mthd_cd;
	public String cont_yys;
	public String redm_rate;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;

	public AS_REDM_1304_ADM(){}
	public AS_REDM_1304_ADM(String mode, String cmpy_cd, String aply_dt, String redm_mthd_cd, String cont_yys, String redm_rate, String incmg_pers_ipadd, String incmg_pers, String chg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.aply_dt = aply_dt;
		this.redm_mthd_cd = redm_mthd_cd;
		this.cont_yys = cont_yys;
		this.redm_rate = redm_rate;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setRedm_mthd_cd(String redm_mthd_cd){
		this.redm_mthd_cd = redm_mthd_cd;
	}

	public void setCont_yys(String cont_yys){
		this.cont_yys = cont_yys;
	}

	public void setRedm_rate(String redm_rate){
		this.redm_rate = redm_rate;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getRedm_mthd_cd(){
		return this.redm_mthd_cd;
	}

	public String getCont_yys(){
		return this.cont_yys;
	}

	public String getRedm_rate(){
		return this.redm_rate;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_REDM_1304_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_REDM_1304_ADM dm = (AS_REDM_1304_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.aply_dt);
		cstmt.setString(6, dm.redm_mthd_cd);
		cstmt.setString(7, dm.cont_yys);
		cstmt.setString(8, dm.redm_rate);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.redm.ds.AS_REDM_1304_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aply_dt = [" + getAply_dt() + "]");
		System.out.println("redm_mthd_cd = [" + getRedm_mthd_cd() + "]");
		System.out.println("cont_yys = [" + getCont_yys() + "]");
		System.out.println("redm_rate = [" + getRedm_rate() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
}
String redm_mthd_cd = req.getParameter("redm_mthd_cd");
if( redm_mthd_cd == null){
	System.out.println(this.toString+" : redm_mthd_cd is null" );
}else{
	System.out.println(this.toString+" : redm_mthd_cd is "+redm_mthd_cd );
}
String cont_yys = req.getParameter("cont_yys");
if( cont_yys == null){
	System.out.println(this.toString+" : cont_yys is null" );
}else{
	System.out.println(this.toString+" : cont_yys is "+cont_yys );
}
String redm_rate = req.getParameter("redm_rate");
if( redm_rate == null){
	System.out.println(this.toString+" : redm_rate is null" );
}else{
	System.out.println(this.toString+" : redm_rate is "+redm_rate );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String redm_mthd_cd = Util.checkString(req.getParameter("redm_mthd_cd"));
String cont_yys = Util.checkString(req.getParameter("cont_yys"));
String redm_rate = Util.checkString(req.getParameter("redm_rate"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String redm_mthd_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("redm_mthd_cd")));
String cont_yys = Util.Uni2Ksc(Util.checkString(req.getParameter("cont_yys")));
String redm_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("redm_rate")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setAply_dt(aply_dt);
dm.setRedm_mthd_cd(redm_mthd_cd);
dm.setCont_yys(cont_yys);
dm.setRedm_rate(redm_rate);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 07 15:22:47 KST 2009 */