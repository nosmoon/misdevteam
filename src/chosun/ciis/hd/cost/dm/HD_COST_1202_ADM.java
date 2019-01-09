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


package chosun.ciis.hd.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.cost.ds.*;
import chosun.ciis.hd.cost.rec.*;

/**
 * 
 */


public class HD_COST_1202_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String card_mang_no;
	public String hd_card_type;
	public String hd_card_stat;
	public String hd_mang_clsf;
	public String hd_mang_dty_nm;
	public String hd_oil_type;
	public String incmg_pers;

	public HD_COST_1202_ADM(){}
	public HD_COST_1202_ADM(String cmpy_cd, String card_mang_no, String hd_card_type, String hd_card_stat, String hd_mang_clsf, String hd_mang_dty_nm, String hd_oil_type, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.card_mang_no = card_mang_no;
		this.hd_card_type = hd_card_type;
		this.hd_card_stat = hd_card_stat;
		this.hd_mang_clsf = hd_mang_clsf;
		this.hd_mang_dty_nm = hd_mang_dty_nm;
		this.hd_oil_type = hd_oil_type;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCard_mang_no(String card_mang_no){
		this.card_mang_no = card_mang_no;
	}

	public void setHd_card_type(String hd_card_type){
		this.hd_card_type = hd_card_type;
	}

	public void setHd_card_stat(String hd_card_stat){
		this.hd_card_stat = hd_card_stat;
	}

	public void setHd_mang_clsf(String hd_mang_clsf){
		this.hd_mang_clsf = hd_mang_clsf;
	}

	public void setHd_mang_dty_nm(String hd_mang_dty_nm){
		this.hd_mang_dty_nm = hd_mang_dty_nm;
	}

	public void setHd_oil_type(String hd_oil_type){
		this.hd_oil_type = hd_oil_type;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCard_mang_no(){
		return this.card_mang_no;
	}

	public String getHd_card_type(){
		return this.hd_card_type;
	}

	public String getHd_card_stat(){
		return this.hd_card_stat;
	}

	public String getHd_mang_clsf(){
		return this.hd_mang_clsf;
	}

	public String getHd_mang_dty_nm(){
		return this.hd_mang_dty_nm;
	}

	public String getHd_oil_type(){
		return this.hd_oil_type;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_COST_1202_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_COST_1202_ADM dm = (HD_COST_1202_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.card_mang_no);
		cstmt.setString(5, dm.hd_card_type);
		cstmt.setString(6, dm.hd_card_stat);
		cstmt.setString(7, dm.hd_mang_clsf);
		cstmt.setString(8, dm.hd_mang_dty_nm);
		cstmt.setString(9, dm.hd_oil_type);
		cstmt.setString(10, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.cost.ds.HD_COST_1202_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("card_mang_no = " + getCard_mang_no());
        System.out.println("hd_card_type = " + getHd_card_type());
        System.out.println("hd_card_stat = " + getHd_card_stat());
        System.out.println("hd_mang_clsf = " + getHd_mang_clsf());
        System.out.println("hd_mang_dty_nm = " + getHd_mang_dty_nm());
        System.out.println("hd_oil_type = " + getHd_oil_type());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String card_mang_no = req.getParameter("card_mang_no");
if( card_mang_no == null){
	System.out.println(this.toString+" : card_mang_no is null" );
}else{
	System.out.println(this.toString+" : card_mang_no is "+card_mang_no );
}
String hd_card_type = req.getParameter("hd_card_type");
if( hd_card_type == null){
	System.out.println(this.toString+" : hd_card_type is null" );
}else{
	System.out.println(this.toString+" : hd_card_type is "+hd_card_type );
}
String hd_card_stat = req.getParameter("hd_card_stat");
if( hd_card_stat == null){
	System.out.println(this.toString+" : hd_card_stat is null" );
}else{
	System.out.println(this.toString+" : hd_card_stat is "+hd_card_stat );
}
String hd_mang_clsf = req.getParameter("hd_mang_clsf");
if( hd_mang_clsf == null){
	System.out.println(this.toString+" : hd_mang_clsf is null" );
}else{
	System.out.println(this.toString+" : hd_mang_clsf is "+hd_mang_clsf );
}
String hd_mang_dty_nm = req.getParameter("hd_mang_dty_nm");
if( hd_mang_dty_nm == null){
	System.out.println(this.toString+" : hd_mang_dty_nm is null" );
}else{
	System.out.println(this.toString+" : hd_mang_dty_nm is "+hd_mang_dty_nm );
}
String hd_oil_type = req.getParameter("hd_oil_type");
if( hd_oil_type == null){
	System.out.println(this.toString+" : hd_oil_type is null" );
}else{
	System.out.println(this.toString+" : hd_oil_type is "+hd_oil_type );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String card_mang_no = Util.checkString(req.getParameter("card_mang_no"));
String hd_card_type = Util.checkString(req.getParameter("hd_card_type"));
String hd_card_stat = Util.checkString(req.getParameter("hd_card_stat"));
String hd_mang_clsf = Util.checkString(req.getParameter("hd_mang_clsf"));
String hd_mang_dty_nm = Util.checkString(req.getParameter("hd_mang_dty_nm"));
String hd_oil_type = Util.checkString(req.getParameter("hd_oil_type"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String card_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("card_mang_no")));
String hd_card_type = Util.Uni2Ksc(Util.checkString(req.getParameter("hd_card_type")));
String hd_card_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("hd_card_stat")));
String hd_mang_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hd_mang_clsf")));
String hd_mang_dty_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("hd_mang_dty_nm")));
String hd_oil_type = Util.Uni2Ksc(Util.checkString(req.getParameter("hd_oil_type")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCard_mang_no(card_mang_no);
dm.setHd_card_type(hd_card_type);
dm.setHd_card_stat(hd_card_stat);
dm.setHd_mang_clsf(hd_mang_clsf);
dm.setHd_mang_dty_nm(hd_mang_dty_nm);
dm.setHd_oil_type(hd_oil_type);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 18 10:24:43 KST 2009 */