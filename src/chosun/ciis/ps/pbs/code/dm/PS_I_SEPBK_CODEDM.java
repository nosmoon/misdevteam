/***************************************************************************************************
 * 파일명   : PS_I_SEPBK_CODEDM.java
 * 기능     : 코드-단행본 등록 입력
 * 작성일자 : 2004-09-21
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ps.pbs.code.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.ds.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 * 코드-단행본 등록 입력
 */

public class PS_I_SEPBK_CODEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String medicd;
	public String medi_clsf;
	public String mediser_no;
	public String sep_bookcdnm;
	public String issuclsf;
	public String basiyymm;
	public long uprc;
	public long subsuprc;
	public long dcrate;
	public String contclascd;
	public String author;
	public String type;
	public String std;
	public long page;
	public String covermodl;
	public String reg_dt;
	public long extdtms;
	public String absenceyn;
	public String absencedt;
	public String absenceprocdt;
	public String incmgpers;
	public long bundunit;
	public long unitmidlqunt;
	public long pjbasimidlqunt;
	public String sericd;
	public String memo;

	public PS_I_SEPBK_CODEDM(){}
	public PS_I_SEPBK_CODEDM(String cmpycd, String medicd, String medi_clsf, String mediser_no, String sep_bookcdnm, String issuclsf, String basiyymm, long uprc, long subsuprc, long dcrate, String contclascd, String author, String type, String std, long page, String covermodl, String reg_dt, long extdtms, String absenceyn, String absencedt, String absenceprocdt, String incmgpers, long bundunit, long unitmidlqunt, long pjbasimidlqunt, String sericd, String memo){
		this.cmpycd = cmpycd;
		this.medicd = medicd;
		this.medi_clsf = medi_clsf;
		this.mediser_no = mediser_no;
		this.sep_bookcdnm = sep_bookcdnm;
		this.issuclsf = issuclsf;
		this.basiyymm = basiyymm;
		this.uprc = uprc;
		this.subsuprc = subsuprc;
		this.dcrate = dcrate;
		this.contclascd = contclascd;
		this.author = author;
		this.type = type;
		this.std = std;
		this.page = page;
		this.covermodl = covermodl;
		this.reg_dt = reg_dt;
		this.extdtms = extdtms;
		this.absenceyn = absenceyn;
		this.absencedt = absencedt;
		this.absenceprocdt = absenceprocdt;
		this.incmgpers = incmgpers;
		this.bundunit = bundunit;
		this.unitmidlqunt = unitmidlqunt;
		this.pjbasimidlqunt = pjbasimidlqunt;
		this.sericd = sericd;
		this.memo = memo;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setSep_bookcdnm(String sep_bookcdnm){
		this.sep_bookcdnm = sep_bookcdnm;
	}

	public void setIssuclsf(String issuclsf){
		this.issuclsf = issuclsf;
	}

	public void setBasiyymm(String basiyymm){
		this.basiyymm = basiyymm;
	}

	public void setUprc(long uprc){
		this.uprc = uprc;
	}

	public void setSubsuprc(long subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setDcrate(long dcrate){
		this.dcrate = dcrate;
	}

	public void setContclascd(String contclascd){
		this.contclascd = contclascd;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public void setType(String type){
		this.type = type;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setPage(long page){
		this.page = page;
	}

	public void setCovermodl(String covermodl){
		this.covermodl = covermodl;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setExtdtms(long extdtms){
		this.extdtms = extdtms;
	}

	public void setAbsenceyn(String absenceyn){
		this.absenceyn = absenceyn;
	}

	public void setAbsencedt(String absencedt){
		this.absencedt = absencedt;
	}

	public void setAbsenceprocdt(String absenceprocdt){
		this.absenceprocdt = absenceprocdt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBundunit(long bundunit){
		this.bundunit = bundunit;
	}

	public void setUnitmidlqunt(long unitmidlqunt){
		this.unitmidlqunt = unitmidlqunt;
	}

	public void setPjbasimidlqunt(long pjbasimidlqunt){
		this.pjbasimidlqunt = pjbasimidlqunt;
	}

	public void setSericd(String sericd){
		this.sericd = sericd;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public String getSep_bookcdnm(){
		return this.sep_bookcdnm;
	}

	public String getIssuclsf(){
		return this.issuclsf;
	}

	public String getBasiyymm(){
		return this.basiyymm;
	}

	public long getUprc(){
		return this.uprc;
	}

	public long getSubsuprc(){
		return this.subsuprc;
	}

	public long getDcrate(){
		return this.dcrate;
	}

	public String getContclascd(){
		return this.contclascd;
	}

	public String getAuthor(){
		return this.author;
	}

	public String getType(){
		return this.type;
	}

	public String getStd(){
		return this.std;
	}

	public long getPage(){
		return this.page;
	}

	public String getCovermodl(){
		return this.covermodl;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public long getExtdtms(){
		return this.extdtms;
	}

	public String getAbsenceyn(){
		return this.absenceyn;
	}

	public String getAbsencedt(){
		return this.absencedt;
	}

	public String getAbsenceprocdt(){
		return this.absenceprocdt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public long getBundunit(){
		return this.bundunit;
	}

	public long getUnitmidlqunt(){
		return this.unitmidlqunt;
	}

	public long getPjbasimidlqunt(){
		return this.pjbasimidlqunt;
	}

	public String getSericd(){
		return this.sericd;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getSQL(){
		 return "{ call SP_PS_I_SEPBK_CODE( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_I_SEPBK_CODEDM dm = (PS_I_SEPBK_CODEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.medi_clsf);
		cstmt.setString(6, dm.mediser_no);
		cstmt.setString(7, dm.sep_bookcdnm);
		cstmt.setString(8, dm.issuclsf);
		cstmt.setString(9, dm.basiyymm);
		cstmt.setLong(10, dm.uprc);
		cstmt.setLong(11, dm.subsuprc);
		cstmt.setLong(12, dm.dcrate);
		cstmt.setString(13, dm.contclascd);
		cstmt.setString(14, dm.author);
		cstmt.setString(15, dm.type);
		cstmt.setString(16, dm.std);
		cstmt.setLong(17, dm.page);
		cstmt.setString(18, dm.covermodl);
		cstmt.setString(19, dm.reg_dt);
		cstmt.setLong(20, dm.extdtms);
		cstmt.setString(21, dm.absenceyn);
		cstmt.setString(22, dm.absencedt);
		cstmt.setString(23, dm.absenceprocdt);
		cstmt.setString(24, dm.incmgpers);
		cstmt.setLong(25, dm.bundunit);
		cstmt.setLong(26, dm.unitmidlqunt);
		cstmt.setLong(27, dm.pjbasimidlqunt);
		cstmt.setString(28, dm.sericd);
		cstmt.setString(29, dm.memo);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.code.ds.PS_I_SEPBK_CODEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String mediser_no = req.getParameter("mediser_no");
if( mediser_no == null){
	System.out.println(this.toString+" : mediser_no is null" );
}else{
	System.out.println(this.toString+" : mediser_no is "+mediser_no );
}
String sep_bookcdnm = req.getParameter("sep_bookcdnm");
if( sep_bookcdnm == null){
	System.out.println(this.toString+" : sep_bookcdnm is null" );
}else{
	System.out.println(this.toString+" : sep_bookcdnm is "+sep_bookcdnm );
}
String issuclsf = req.getParameter("issuclsf");
if( issuclsf == null){
	System.out.println(this.toString+" : issuclsf is null" );
}else{
	System.out.println(this.toString+" : issuclsf is "+issuclsf );
}
String basiyymm = req.getParameter("basiyymm");
if( basiyymm == null){
	System.out.println(this.toString+" : basiyymm is null" );
}else{
	System.out.println(this.toString+" : basiyymm is "+basiyymm );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String subsuprc = req.getParameter("subsuprc");
if( subsuprc == null){
	System.out.println(this.toString+" : subsuprc is null" );
}else{
	System.out.println(this.toString+" : subsuprc is "+subsuprc );
}
String dcrate = req.getParameter("dcrate");
if( dcrate == null){
	System.out.println(this.toString+" : dcrate is null" );
}else{
	System.out.println(this.toString+" : dcrate is "+dcrate );
}
String contclascd = req.getParameter("contclascd");
if( contclascd == null){
	System.out.println(this.toString+" : contclascd is null" );
}else{
	System.out.println(this.toString+" : contclascd is "+contclascd );
}
String author = req.getParameter("author");
if( author == null){
	System.out.println(this.toString+" : author is null" );
}else{
	System.out.println(this.toString+" : author is "+author );
}
String type = req.getParameter("type");
if( type == null){
	System.out.println(this.toString+" : type is null" );
}else{
	System.out.println(this.toString+" : type is "+type );
}
String std = req.getParameter("std");
if( std == null){
	System.out.println(this.toString+" : std is null" );
}else{
	System.out.println(this.toString+" : std is "+std );
}
String page = req.getParameter("page");
if( page == null){
	System.out.println(this.toString+" : page is null" );
}else{
	System.out.println(this.toString+" : page is "+page );
}
String covermodl = req.getParameter("covermodl");
if( covermodl == null){
	System.out.println(this.toString+" : covermodl is null" );
}else{
	System.out.println(this.toString+" : covermodl is "+covermodl );
}
String reg_dt = req.getParameter("reg_dt");
if( reg_dt == null){
	System.out.println(this.toString+" : reg_dt is null" );
}else{
	System.out.println(this.toString+" : reg_dt is "+reg_dt );
}
String extdtms = req.getParameter("extdtms");
if( extdtms == null){
	System.out.println(this.toString+" : extdtms is null" );
}else{
	System.out.println(this.toString+" : extdtms is "+extdtms );
}
String absenceyn = req.getParameter("absenceyn");
if( absenceyn == null){
	System.out.println(this.toString+" : absenceyn is null" );
}else{
	System.out.println(this.toString+" : absenceyn is "+absenceyn );
}
String absencedt = req.getParameter("absencedt");
if( absencedt == null){
	System.out.println(this.toString+" : absencedt is null" );
}else{
	System.out.println(this.toString+" : absencedt is "+absencedt );
}
String absenceprocdt = req.getParameter("absenceprocdt");
if( absenceprocdt == null){
	System.out.println(this.toString+" : absenceprocdt is null" );
}else{
	System.out.println(this.toString+" : absenceprocdt is "+absenceprocdt );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String bundunit = req.getParameter("bundunit");
if( bundunit == null){
	System.out.println(this.toString+" : bundunit is null" );
}else{
	System.out.println(this.toString+" : bundunit is "+bundunit );
}
String unitmidlqunt = req.getParameter("unitmidlqunt");
if( unitmidlqunt == null){
	System.out.println(this.toString+" : unitmidlqunt is null" );
}else{
	System.out.println(this.toString+" : unitmidlqunt is "+unitmidlqunt );
}
String pjbasimidlqunt = req.getParameter("pjbasimidlqunt");
if( pjbasimidlqunt == null){
	System.out.println(this.toString+" : pjbasimidlqunt is null" );
}else{
	System.out.println(this.toString+" : pjbasimidlqunt is "+pjbasimidlqunt );
}
String sericd = req.getParameter("sericd");
if( sericd == null){
	System.out.println(this.toString+" : sericd is null" );
}else{
	System.out.println(this.toString+" : sericd is "+sericd );
}
String memo = req.getParameter("memo");
if( memo == null){
	System.out.println(this.toString+" : memo is null" );
}else{
	System.out.println(this.toString+" : memo is "+memo );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String mediser_no = Util.checkString(req.getParameter("mediser_no"));
String sep_bookcdnm = Util.checkString(req.getParameter("sep_bookcdnm"));
String issuclsf = Util.checkString(req.getParameter("issuclsf"));
String basiyymm = Util.checkString(req.getParameter("basiyymm"));
String uprc = Util.checkString(req.getParameter("uprc"));
String subsuprc = Util.checkString(req.getParameter("subsuprc"));
String dcrate = Util.checkString(req.getParameter("dcrate"));
String contclascd = Util.checkString(req.getParameter("contclascd"));
String author = Util.checkString(req.getParameter("author"));
String type = Util.checkString(req.getParameter("type"));
String std = Util.checkString(req.getParameter("std"));
String page = Util.checkString(req.getParameter("page"));
String covermodl = Util.checkString(req.getParameter("covermodl"));
String reg_dt = Util.checkString(req.getParameter("reg_dt"));
String extdtms = Util.checkString(req.getParameter("extdtms"));
String absenceyn = Util.checkString(req.getParameter("absenceyn"));
String absencedt = Util.checkString(req.getParameter("absencedt"));
String absenceprocdt = Util.checkString(req.getParameter("absenceprocdt"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String bundunit = Util.checkString(req.getParameter("bundunit"));
String unitmidlqunt = Util.checkString(req.getParameter("unitmidlqunt"));
String pjbasimidlqunt = Util.checkString(req.getParameter("pjbasimidlqunt"));
String sericd = Util.checkString(req.getParameter("sericd"));
String memo = Util.checkString(req.getParameter("memo"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String mediser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mediser_no")));
String sep_bookcdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("sep_bookcdnm")));
String issuclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("issuclsf")));
String basiyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("basiyymm")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String subsuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("subsuprc")));
String dcrate = Util.Uni2Ksc(Util.checkString(req.getParameter("dcrate")));
String contclascd = Util.Uni2Ksc(Util.checkString(req.getParameter("contclascd")));
String author = Util.Uni2Ksc(Util.checkString(req.getParameter("author")));
String type = Util.Uni2Ksc(Util.checkString(req.getParameter("type")));
String std = Util.Uni2Ksc(Util.checkString(req.getParameter("std")));
String page = Util.Uni2Ksc(Util.checkString(req.getParameter("page")));
String covermodl = Util.Uni2Ksc(Util.checkString(req.getParameter("covermodl")));
String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));
String extdtms = Util.Uni2Ksc(Util.checkString(req.getParameter("extdtms")));
String absenceyn = Util.Uni2Ksc(Util.checkString(req.getParameter("absenceyn")));
String absencedt = Util.Uni2Ksc(Util.checkString(req.getParameter("absencedt")));
String absenceprocdt = Util.Uni2Ksc(Util.checkString(req.getParameter("absenceprocdt")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String bundunit = Util.Uni2Ksc(Util.checkString(req.getParameter("bundunit")));
String unitmidlqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("unitmidlqunt")));
String pjbasimidlqunt = Util.Uni2Ksc(Util.checkString(req.getParameter("pjbasimidlqunt")));
String sericd = Util.Uni2Ksc(Util.checkString(req.getParameter("sericd")));
String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setMedicd(medicd);
dm.setMedi_clsf(medi_clsf);
dm.setMediser_no(mediser_no);
dm.setSep_bookcdnm(sep_bookcdnm);
dm.setIssuclsf(issuclsf);
dm.setBasiyymm(basiyymm);
dm.setUprc(uprc);
dm.setSubsuprc(subsuprc);
dm.setDcrate(dcrate);
dm.setContclascd(contclascd);
dm.setAuthor(author);
dm.setType(type);
dm.setStd(std);
dm.setPage(page);
dm.setCovermodl(covermodl);
dm.setReg_dt(reg_dt);
dm.setExtdtms(extdtms);
dm.setAbsenceyn(absenceyn);
dm.setAbsencedt(absencedt);
dm.setAbsenceprocdt(absenceprocdt);
dm.setIncmgpers(incmgpers);
dm.setBundunit(bundunit);
dm.setUnitmidlqunt(unitmidlqunt);
dm.setPjbasimidlqunt(pjbasimidlqunt);
dm.setSericd(sericd);
dm.setMemo(memo);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 21 15:08:51 KST 2004 */