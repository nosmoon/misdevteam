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


package chosun.ciis.mt.outsdelmt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.outsdelmt.ds.*;
import chosun.ciis.mt.outsdelmt.rec.*;

/**
 * 
 */


public class MT_OUTSDELMT_2002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String mode;
	public String cmpy_cd;
	public String aply_yymm;
	public String outsd_elmt_clsf;
	public String outsd_elmt_cd;
	public String unit;
	public String avg_amt;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public MT_OUTSDELMT_2002_ADM(){}
	public MT_OUTSDELMT_2002_ADM(String occr_dt, String seq, String mode, String cmpy_cd, String aply_yymm, String outsd_elmt_clsf, String outsd_elmt_cd, String unit, String avg_amt, String incmg_pers_ipaddr, String incmg_pers){
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.aply_yymm = aply_yymm;
		this.outsd_elmt_clsf = outsd_elmt_clsf;
		this.outsd_elmt_cd = outsd_elmt_cd;
		this.unit = unit;
		this.avg_amt = avg_amt;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_yymm(String aply_yymm){
		this.aply_yymm = aply_yymm;
	}

	public void setOutsd_elmt_clsf(String outsd_elmt_clsf){
		this.outsd_elmt_clsf = outsd_elmt_clsf;
	}

	public void setOutsd_elmt_cd(String outsd_elmt_cd){
		this.outsd_elmt_cd = outsd_elmt_cd;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setAvg_amt(String avg_amt){
		this.avg_amt = avg_amt;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_yymm(){
		return this.aply_yymm;
	}

	public String getOutsd_elmt_clsf(){
		return this.outsd_elmt_clsf;
	}

	public String getOutsd_elmt_cd(){
		return this.outsd_elmt_cd;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getAvg_amt(){
		return this.avg_amt;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_MT_OUTSDELMT_2002_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_OUTSDELMT_2002_ADM dm = (MT_OUTSDELMT_2002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.occr_dt);
		cstmt.setString(4, dm.seq);
		cstmt.setString(5, dm.mode);
		cstmt.setString(6, dm.cmpy_cd);
		cstmt.setString(7, dm.aply_yymm);
		cstmt.setString(8, dm.outsd_elmt_clsf);
		cstmt.setString(9, dm.outsd_elmt_cd);
		cstmt.setString(10, dm.unit);
		cstmt.setString(11, dm.avg_amt);
		cstmt.setString(12, dm.incmg_pers_ipaddr);
		cstmt.setString(13, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.outsdelmt.ds.MT_OUTSDELMT_2002_ADataSet();
	}



    public void print(){
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("seq = " + getSeq());
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("aply_yymm = " + getAply_yymm());
        System.out.println("outsd_elmt_clsf = " + getOutsd_elmt_clsf());
        System.out.println("outsd_elmt_cd = " + getOutsd_elmt_cd());
        System.out.println("unit = " + getUnit());
        System.out.println("avg_amt = " + getAvg_amt());
        System.out.println("incmg_pers_ipaddr = " + getIncmg_pers_ipaddr());
        System.out.println("incmg_pers = " + getIncmg_pers());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
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
String aply_yymm = req.getParameter("aply_yymm");
if( aply_yymm == null){
	System.out.println(this.toString+" : aply_yymm is null" );
}else{
	System.out.println(this.toString+" : aply_yymm is "+aply_yymm );
}
String outsd_elmt_clsf = req.getParameter("outsd_elmt_clsf");
if( outsd_elmt_clsf == null){
	System.out.println(this.toString+" : outsd_elmt_clsf is null" );
}else{
	System.out.println(this.toString+" : outsd_elmt_clsf is "+outsd_elmt_clsf );
}
String outsd_elmt_cd = req.getParameter("outsd_elmt_cd");
if( outsd_elmt_cd == null){
	System.out.println(this.toString+" : outsd_elmt_cd is null" );
}else{
	System.out.println(this.toString+" : outsd_elmt_cd is "+outsd_elmt_cd );
}
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String avg_amt = req.getParameter("avg_amt");
if( avg_amt == null){
	System.out.println(this.toString+" : avg_amt is null" );
}else{
	System.out.println(this.toString+" : avg_amt is "+avg_amt );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
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

String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_yymm = Util.checkString(req.getParameter("aply_yymm"));
String outsd_elmt_clsf = Util.checkString(req.getParameter("outsd_elmt_clsf"));
String outsd_elmt_cd = Util.checkString(req.getParameter("outsd_elmt_cd"));
String unit = Util.checkString(req.getParameter("unit"));
String avg_amt = Util.checkString(req.getParameter("avg_amt"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yymm")));
String outsd_elmt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("outsd_elmt_clsf")));
String outsd_elmt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("outsd_elmt_cd")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String avg_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("avg_amt")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setAply_yymm(aply_yymm);
dm.setOutsd_elmt_clsf(outsd_elmt_clsf);
dm.setOutsd_elmt_cd(outsd_elmt_cd);
dm.setUnit(unit);
dm.setAvg_amt(avg_amt);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 20:25:36 KST 2009 */