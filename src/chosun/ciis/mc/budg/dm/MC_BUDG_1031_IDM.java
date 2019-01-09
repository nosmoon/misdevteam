/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_1031_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String insert_mode;
	public String budg_cd;
	public String itm_15;
	public String itm_16;
	public String itm_17;
	public String itm_25;
	public String itm_35;
	public String itm_91;
	public String itm_92;
	public String itm_93;
	public String itm_94;
	public String itm_95;
	public String itm_96;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public MC_BUDG_1031_IDM(){}
	public MC_BUDG_1031_IDM(String cmpy_cd, String insert_mode, String budg_cd, String itm_15, String itm_16, String itm_17, String itm_25, String itm_35, String itm_91, String itm_92, String itm_93, String itm_94, String itm_95, String itm_96, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.insert_mode = insert_mode;
		this.budg_cd = budg_cd;
		this.itm_15 = itm_15;
		this.itm_16 = itm_16;
		this.itm_17 = itm_17;
		this.itm_25 = itm_25;
		this.itm_35 = itm_35;
		this.itm_91 = itm_91;
		this.itm_92 = itm_92;
		this.itm_93 = itm_93;
		this.itm_94 = itm_94;
		this.itm_95 = itm_95;
		this.itm_96 = itm_96;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setInsert_mode(String insert_mode){
		this.insert_mode = insert_mode;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setItm_15(String itm_15){
		this.itm_15 = itm_15;
	}

	public void setItm_16(String itm_16){
		this.itm_16 = itm_16;
	}

	public void setItm_17(String itm_17){
		this.itm_17 = itm_17;
	}

	public void setItm_25(String itm_25){
		this.itm_25 = itm_25;
	}

	public void setItm_35(String itm_35){
		this.itm_35 = itm_35;
	}

	public void setItm_91(String itm_91){
		this.itm_91 = itm_91;
	}

	public void setItm_92(String itm_92){
		this.itm_92 = itm_92;
	}

	public void setItm_93(String itm_93){
		this.itm_93 = itm_93;
	}

	public void setItm_94(String itm_94){
		this.itm_94 = itm_94;
	}

	public void setItm_95(String itm_95){
		this.itm_95 = itm_95;
	}

	public void setItm_96(String itm_96){
		this.itm_96 = itm_96;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getInsert_mode(){
		return this.insert_mode;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getItm_15(){
		return this.itm_15;
	}

	public String getItm_16(){
		return this.itm_16;
	}

	public String getItm_17(){
		return this.itm_17;
	}

	public String getItm_25(){
		return this.itm_25;
	}

	public String getItm_35(){
		return this.itm_35;
	}

	public String getItm_91(){
		return this.itm_91;
	}

	public String getItm_92(){
		return this.itm_92;
	}

	public String getItm_93(){
		return this.itm_93;
	}

	public String getItm_94(){
		return this.itm_94;
	}

	public String getItm_95(){
		return this.itm_95;
	}

	public String getItm_96(){
		return this.itm_96;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_1031_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_1031_IDM dm = (MC_BUDG_1031_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.insert_mode);
		cstmt.setString(5, dm.budg_cd);
		cstmt.setString(6, dm.itm_15);
		cstmt.setString(7, dm.itm_16);
		cstmt.setString(8, dm.itm_17);
		cstmt.setString(9, dm.itm_25);
		cstmt.setString(10, dm.itm_35);
		cstmt.setString(11, dm.itm_91);
		cstmt.setString(12, dm.itm_92);
		cstmt.setString(13, dm.itm_93);
		cstmt.setString(14, dm.itm_94);
		cstmt.setString(15, dm.itm_95);
		cstmt.setString(16, dm.itm_96);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_1031_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("insert_mode = [" + getInsert_mode() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("itm_15 = [" + getItm_15() + "]");
		System.out.println("itm_16 = [" + getItm_16() + "]");
		System.out.println("itm_17 = [" + getItm_17() + "]");
		System.out.println("itm_25 = [" + getItm_25() + "]");
		System.out.println("itm_35 = [" + getItm_35() + "]");
		System.out.println("itm_91 = [" + getItm_91() + "]");
		System.out.println("itm_92 = [" + getItm_92() + "]");
		System.out.println("itm_93 = [" + getItm_93() + "]");
		System.out.println("itm_94 = [" + getItm_94() + "]");
		System.out.println("itm_95 = [" + getItm_95() + "]");
		System.out.println("itm_96 = [" + getItm_96() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String insert_mode = req.getParameter("insert_mode");
if( insert_mode == null){
	System.out.println(this.toString+" : insert_mode is null" );
}else{
	System.out.println(this.toString+" : insert_mode is "+insert_mode );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String itm_15 = req.getParameter("itm_15");
if( itm_15 == null){
	System.out.println(this.toString+" : itm_15 is null" );
}else{
	System.out.println(this.toString+" : itm_15 is "+itm_15 );
}
String itm_16 = req.getParameter("itm_16");
if( itm_16 == null){
	System.out.println(this.toString+" : itm_16 is null" );
}else{
	System.out.println(this.toString+" : itm_16 is "+itm_16 );
}
String itm_17 = req.getParameter("itm_17");
if( itm_17 == null){
	System.out.println(this.toString+" : itm_17 is null" );
}else{
	System.out.println(this.toString+" : itm_17 is "+itm_17 );
}
String itm_25 = req.getParameter("itm_25");
if( itm_25 == null){
	System.out.println(this.toString+" : itm_25 is null" );
}else{
	System.out.println(this.toString+" : itm_25 is "+itm_25 );
}
String itm_35 = req.getParameter("itm_35");
if( itm_35 == null){
	System.out.println(this.toString+" : itm_35 is null" );
}else{
	System.out.println(this.toString+" : itm_35 is "+itm_35 );
}
String itm_91 = req.getParameter("itm_91");
if( itm_91 == null){
	System.out.println(this.toString+" : itm_91 is null" );
}else{
	System.out.println(this.toString+" : itm_91 is "+itm_91 );
}
String itm_92 = req.getParameter("itm_92");
if( itm_92 == null){
	System.out.println(this.toString+" : itm_92 is null" );
}else{
	System.out.println(this.toString+" : itm_92 is "+itm_92 );
}
String itm_93 = req.getParameter("itm_93");
if( itm_93 == null){
	System.out.println(this.toString+" : itm_93 is null" );
}else{
	System.out.println(this.toString+" : itm_93 is "+itm_93 );
}
String itm_94 = req.getParameter("itm_94");
if( itm_94 == null){
	System.out.println(this.toString+" : itm_94 is null" );
}else{
	System.out.println(this.toString+" : itm_94 is "+itm_94 );
}
String itm_95 = req.getParameter("itm_95");
if( itm_95 == null){
	System.out.println(this.toString+" : itm_95 is null" );
}else{
	System.out.println(this.toString+" : itm_95 is "+itm_95 );
}
String itm_96 = req.getParameter("itm_96");
if( itm_96 == null){
	System.out.println(this.toString+" : itm_96 is null" );
}else{
	System.out.println(this.toString+" : itm_96 is "+itm_96 );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String insert_mode = Util.checkString(req.getParameter("insert_mode"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String itm_15 = Util.checkString(req.getParameter("itm_15"));
String itm_16 = Util.checkString(req.getParameter("itm_16"));
String itm_17 = Util.checkString(req.getParameter("itm_17"));
String itm_25 = Util.checkString(req.getParameter("itm_25"));
String itm_35 = Util.checkString(req.getParameter("itm_35"));
String itm_91 = Util.checkString(req.getParameter("itm_91"));
String itm_92 = Util.checkString(req.getParameter("itm_92"));
String itm_93 = Util.checkString(req.getParameter("itm_93"));
String itm_94 = Util.checkString(req.getParameter("itm_94"));
String itm_95 = Util.checkString(req.getParameter("itm_95"));
String itm_96 = Util.checkString(req.getParameter("itm_96"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String insert_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("insert_mode")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String itm_15 = Util.Uni2Ksc(Util.checkString(req.getParameter("itm_15")));
String itm_16 = Util.Uni2Ksc(Util.checkString(req.getParameter("itm_16")));
String itm_17 = Util.Uni2Ksc(Util.checkString(req.getParameter("itm_17")));
String itm_25 = Util.Uni2Ksc(Util.checkString(req.getParameter("itm_25")));
String itm_35 = Util.Uni2Ksc(Util.checkString(req.getParameter("itm_35")));
String itm_91 = Util.Uni2Ksc(Util.checkString(req.getParameter("itm_91")));
String itm_92 = Util.Uni2Ksc(Util.checkString(req.getParameter("itm_92")));
String itm_93 = Util.Uni2Ksc(Util.checkString(req.getParameter("itm_93")));
String itm_94 = Util.Uni2Ksc(Util.checkString(req.getParameter("itm_94")));
String itm_95 = Util.Uni2Ksc(Util.checkString(req.getParameter("itm_95")));
String itm_96 = Util.Uni2Ksc(Util.checkString(req.getParameter("itm_96")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setInsert_mode(insert_mode);
dm.setBudg_cd(budg_cd);
dm.setItm_15(itm_15);
dm.setItm_16(itm_16);
dm.setItm_17(itm_17);
dm.setItm_25(itm_25);
dm.setItm_35(itm_35);
dm.setItm_91(itm_91);
dm.setItm_92(itm_92);
dm.setItm_93(itm_93);
dm.setItm_94(itm_94);
dm.setItm_95(itm_95);
dm.setItm_96(itm_96);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 13 11:52:21 KST 2009 */