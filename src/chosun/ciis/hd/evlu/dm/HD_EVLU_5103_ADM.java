/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.evlu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.ds.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 *
 */

public class HD_EVLU_5103_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy_src;
	public String tms_clsf_src;
	public String evlu_yy_dest;
	public String tms_clsf_dest;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;

	public HD_EVLU_5103_ADM(){}
	public HD_EVLU_5103_ADM(String cmpy_cd, String evlu_yy_src, String tms_clsf_src, String evlu_yy_dest, String tms_clsf_dest, String incmg_pers_ipadd, String incmg_pers, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.evlu_yy_src = evlu_yy_src;
		this.tms_clsf_src = tms_clsf_src;
		this.evlu_yy_dest = evlu_yy_dest;
		this.tms_clsf_dest = tms_clsf_dest;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvlu_yy_src(String evlu_yy_src){
		this.evlu_yy_src = evlu_yy_src;
	}

	public void setTms_clsf_src(String tms_clsf_src){
		this.tms_clsf_src = tms_clsf_src;
	}

	public void setEvlu_yy_dest(String evlu_yy_dest){
		this.evlu_yy_dest = evlu_yy_dest;
	}

	public void setTms_clsf_dest(String tms_clsf_dest){
		this.tms_clsf_dest = tms_clsf_dest;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvlu_yy_src(){
		return this.evlu_yy_src;
	}

	public String getTms_clsf_src(){
		return this.tms_clsf_src;
	}

	public String getEvlu_yy_dest(){
		return this.evlu_yy_dest;
	}

	public String getTms_clsf_dest(){
		return this.tms_clsf_dest;
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
		 return "{ call MISHDL.SP_HD_EVLU_5103_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EVLU_5103_ADM dm = (HD_EVLU_5103_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evlu_yy_src);
		cstmt.setString(5, dm.tms_clsf_src);
		cstmt.setString(6, dm.evlu_yy_dest);
		cstmt.setString(7, dm.tms_clsf_dest);
		cstmt.setString(8, dm.incmg_pers_ipadd);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.evlu.ds.HD_EVLU_5103_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("evlu_yy_src = " + getEvlu_yy_src());
        System.out.println("tms_clsf_src = " + getTms_clsf_src());
        System.out.println("evlu_yy_dest = " + getEvlu_yy_dest());
        System.out.println("tms_clsf_dest = " + getTms_clsf_dest());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
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
String evlu_yy_src = req.getParameter("evlu_yy_src");
if( evlu_yy_src == null){
	System.out.println(this.toString+" : evlu_yy_src is null" );
}else{
	System.out.println(this.toString+" : evlu_yy_src is "+evlu_yy_src );
}
String tms_clsf_src = req.getParameter("tms_clsf_src");
if( tms_clsf_src == null){
	System.out.println(this.toString+" : tms_clsf_src is null" );
}else{
	System.out.println(this.toString+" : tms_clsf_src is "+tms_clsf_src );
}
String evlu_yy_dest = req.getParameter("evlu_yy_dest");
if( evlu_yy_dest == null){
	System.out.println(this.toString+" : evlu_yy_dest is null" );
}else{
	System.out.println(this.toString+" : evlu_yy_dest is "+evlu_yy_dest );
}
String tms_clsf_dest = req.getParameter("tms_clsf_dest");
if( tms_clsf_dest == null){
	System.out.println(this.toString+" : tms_clsf_dest is null" );
}else{
	System.out.println(this.toString+" : tms_clsf_dest is "+tms_clsf_dest );
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
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evlu_yy_src = Util.checkString(req.getParameter("evlu_yy_src"));
String tms_clsf_src = Util.checkString(req.getParameter("tms_clsf_src"));
String evlu_yy_dest = Util.checkString(req.getParameter("evlu_yy_dest"));
String tms_clsf_dest = Util.checkString(req.getParameter("tms_clsf_dest"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evlu_yy_src = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yy_src")));
String tms_clsf_src = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_clsf_src")));
String evlu_yy_dest = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yy_dest")));
String tms_clsf_dest = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_clsf_dest")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvlu_yy_src(evlu_yy_src);
dm.setTms_clsf_src(tms_clsf_src);
dm.setEvlu_yy_dest(evlu_yy_dest);
dm.setTms_clsf_dest(tms_clsf_dest);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 11 16:26:42 KST 2009 */