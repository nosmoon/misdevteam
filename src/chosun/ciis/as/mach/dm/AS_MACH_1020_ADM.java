/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.mach.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.mach.ds.*;
import chosun.ciis.as.mach.rec.*;

/**
 * 
 */


public class AS_MACH_1020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mach_seq;
	public String work_clsf;
	public String mach_clsf;
	public String bldg_clsf;
	public String mach_name;
	public String model_name;
	public String stnd;
	public String usag;
	public String loca;
	public String inst_dt;
	public String exp_dt;
	public String make_comp;
	public String inst_comp;
	public String inst_fee;
	public String as_comp;
	public String as_fee;
	public String as_tel;
	public String remk;
	public String file_size;
	public byte[] up_phot_img;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String job_clsf;

	public AS_MACH_1020_ADM(){}
	public AS_MACH_1020_ADM(String cmpy_cd, String mach_seq, String work_clsf, String mach_clsf, String bldg_clsf, String mach_name, String model_name, String stnd, String usag, String loca, String inst_dt, String exp_dt, String make_comp, String inst_comp, String inst_fee, String as_comp, String as_fee, String as_tel, String remk, String file_size, byte[] up_phot_img, String incmg_pers_ipadd, String incmg_pers, String job_clsf){
		this.cmpy_cd = cmpy_cd;
		this.mach_seq = mach_seq;
		this.work_clsf = work_clsf;
		this.mach_clsf = mach_clsf;
		this.bldg_clsf = bldg_clsf;
		this.mach_name = mach_name;
		this.model_name = model_name;
		this.stnd = stnd;
		this.usag = usag;
		this.loca = loca;
		this.inst_dt = inst_dt;
		this.exp_dt = exp_dt;
		this.make_comp = make_comp;
		this.inst_comp = inst_comp;
		this.inst_fee = inst_fee;
		this.as_comp = as_comp;
		this.as_fee = as_fee;
		this.as_tel = as_tel;
		this.remk = remk;
		this.file_size = file_size;
		this.up_phot_img = up_phot_img;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.job_clsf = job_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMach_seq(String mach_seq){
		this.mach_seq = mach_seq;
	}

	public void setWork_clsf(String work_clsf){
		this.work_clsf = work_clsf;
	}

	public void setMach_clsf(String mach_clsf){
		this.mach_clsf = mach_clsf;
	}

	public void setBldg_clsf(String bldg_clsf){
		this.bldg_clsf = bldg_clsf;
	}

	public void setMach_name(String mach_name){
		this.mach_name = mach_name;
	}

	public void setModel_name(String model_name){
		this.model_name = model_name;
	}

	public void setStnd(String stnd){
		this.stnd = stnd;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setLoca(String loca){
		this.loca = loca;
	}

	public void setInst_dt(String inst_dt){
		this.inst_dt = inst_dt;
	}

	public void setExp_dt(String exp_dt){
		this.exp_dt = exp_dt;
	}

	public void setMake_comp(String make_comp){
		this.make_comp = make_comp;
	}

	public void setInst_comp(String inst_comp){
		this.inst_comp = inst_comp;
	}

	public void setInst_fee(String inst_fee){
		this.inst_fee = inst_fee;
	}

	public void setAs_comp(String as_comp){
		this.as_comp = as_comp;
	}

	public void setAs_fee(String as_fee){
		this.as_fee = as_fee;
	}

	public void setAs_tel(String as_tel){
		this.as_tel = as_tel;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setFile_size(String file_size){
		this.file_size = file_size;
	}

	public void setUp_phot_img(byte[] up_phot_img){
		this.up_phot_img = up_phot_img;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMach_seq(){
		return this.mach_seq;
	}

	public String getWork_clsf(){
		return this.work_clsf;
	}

	public String getMach_clsf(){
		return this.mach_clsf;
	}

	public String getBldg_clsf(){
		return this.bldg_clsf;
	}

	public String getMach_name(){
		return this.mach_name;
	}

	public String getModel_name(){
		return this.model_name;
	}

	public String getStnd(){
		return this.stnd;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getLoca(){
		return this.loca;
	}

	public String getInst_dt(){
		return this.inst_dt;
	}

	public String getExp_dt(){
		return this.exp_dt;
	}

	public String getMake_comp(){
		return this.make_comp;
	}

	public String getInst_comp(){
		return this.inst_comp;
	}

	public String getInst_fee(){
		return this.inst_fee;
	}

	public String getAs_comp(){
		return this.as_comp;
	}

	public String getAs_fee(){
		return this.as_fee;
	}

	public String getAs_tel(){
		return this.as_tel;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getFile_size(){
		return this.file_size;
	}

	public byte[] getUp_phot_img(){
		return this.up_phot_img;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_MACH_1020_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_MACH_1020_ADM dm = (AS_MACH_1020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mach_seq);
		cstmt.setString(5, dm.work_clsf);
		cstmt.setString(6, dm.mach_clsf);
		cstmt.setString(7, dm.bldg_clsf);
		cstmt.setString(8, dm.mach_name);
		cstmt.setString(9, dm.model_name);
		cstmt.setString(10, dm.stnd);
		cstmt.setString(11, dm.usag);
		cstmt.setString(12, dm.loca);
		cstmt.setString(13, dm.inst_dt);
		cstmt.setString(14, dm.exp_dt);
		cstmt.setString(15, dm.make_comp);
		cstmt.setString(16, dm.inst_comp);
		cstmt.setString(17, dm.inst_fee);
		cstmt.setString(18, dm.as_comp);
		cstmt.setString(19, dm.as_fee);
		cstmt.setString(20, dm.as_tel);
		cstmt.setString(21, dm.remk);
		cstmt.setString(22, dm.file_size);
		cstmt.setBytes(23, dm.up_phot_img);
		cstmt.setString(24, dm.incmg_pers_ipadd);
		cstmt.setString(25, dm.incmg_pers);
		cstmt.setString(26, dm.job_clsf);
		cstmt.registerOutParameter(27, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.mach.ds.AS_MACH_1020_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mach_seq = [" + getMach_seq() + "]");
		System.out.println("work_clsf = [" + getWork_clsf() + "]");
		System.out.println("mach_clsf = [" + getMach_clsf() + "]");
		System.out.println("bldg_clsf = [" + getBldg_clsf() + "]");
		System.out.println("mach_name = [" + getMach_name() + "]");
		System.out.println("model_name = [" + getModel_name() + "]");
		System.out.println("stnd = [" + getStnd() + "]");
		System.out.println("usag = [" + getUsag() + "]");
		System.out.println("loca = [" + getLoca() + "]");
		System.out.println("inst_dt = [" + getInst_dt() + "]");
		System.out.println("exp_dt = [" + getExp_dt() + "]");
		System.out.println("make_comp = [" + getMake_comp() + "]");
		System.out.println("inst_comp = [" + getInst_comp() + "]");
		System.out.println("inst_fee = [" + getInst_fee() + "]");
		System.out.println("as_comp = [" + getAs_comp() + "]");
		System.out.println("as_fee = [" + getAs_fee() + "]");
		System.out.println("as_tel = [" + getAs_tel() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("file_size = [" + getFile_size() + "]");
		System.out.println("up_phot_img = [" + getUp_phot_img() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("job_clsf = [" + getJob_clsf() + "]");
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
String mach_seq = req.getParameter("mach_seq");
if( mach_seq == null){
	System.out.println(this.toString+" : mach_seq is null" );
}else{
	System.out.println(this.toString+" : mach_seq is "+mach_seq );
}
String work_clsf = req.getParameter("work_clsf");
if( work_clsf == null){
	System.out.println(this.toString+" : work_clsf is null" );
}else{
	System.out.println(this.toString+" : work_clsf is "+work_clsf );
}
String mach_clsf = req.getParameter("mach_clsf");
if( mach_clsf == null){
	System.out.println(this.toString+" : mach_clsf is null" );
}else{
	System.out.println(this.toString+" : mach_clsf is "+mach_clsf );
}
String bldg_clsf = req.getParameter("bldg_clsf");
if( bldg_clsf == null){
	System.out.println(this.toString+" : bldg_clsf is null" );
}else{
	System.out.println(this.toString+" : bldg_clsf is "+bldg_clsf );
}
String mach_name = req.getParameter("mach_name");
if( mach_name == null){
	System.out.println(this.toString+" : mach_name is null" );
}else{
	System.out.println(this.toString+" : mach_name is "+mach_name );
}
String model_name = req.getParameter("model_name");
if( model_name == null){
	System.out.println(this.toString+" : model_name is null" );
}else{
	System.out.println(this.toString+" : model_name is "+model_name );
}
String stnd = req.getParameter("stnd");
if( stnd == null){
	System.out.println(this.toString+" : stnd is null" );
}else{
	System.out.println(this.toString+" : stnd is "+stnd );
}
String usag = req.getParameter("usag");
if( usag == null){
	System.out.println(this.toString+" : usag is null" );
}else{
	System.out.println(this.toString+" : usag is "+usag );
}
String loca = req.getParameter("loca");
if( loca == null){
	System.out.println(this.toString+" : loca is null" );
}else{
	System.out.println(this.toString+" : loca is "+loca );
}
String inst_dt = req.getParameter("inst_dt");
if( inst_dt == null){
	System.out.println(this.toString+" : inst_dt is null" );
}else{
	System.out.println(this.toString+" : inst_dt is "+inst_dt );
}
String exp_dt = req.getParameter("exp_dt");
if( exp_dt == null){
	System.out.println(this.toString+" : exp_dt is null" );
}else{
	System.out.println(this.toString+" : exp_dt is "+exp_dt );
}
String make_comp = req.getParameter("make_comp");
if( make_comp == null){
	System.out.println(this.toString+" : make_comp is null" );
}else{
	System.out.println(this.toString+" : make_comp is "+make_comp );
}
String inst_comp = req.getParameter("inst_comp");
if( inst_comp == null){
	System.out.println(this.toString+" : inst_comp is null" );
}else{
	System.out.println(this.toString+" : inst_comp is "+inst_comp );
}
String inst_fee = req.getParameter("inst_fee");
if( inst_fee == null){
	System.out.println(this.toString+" : inst_fee is null" );
}else{
	System.out.println(this.toString+" : inst_fee is "+inst_fee );
}
String as_comp = req.getParameter("as_comp");
if( as_comp == null){
	System.out.println(this.toString+" : as_comp is null" );
}else{
	System.out.println(this.toString+" : as_comp is "+as_comp );
}
String as_fee = req.getParameter("as_fee");
if( as_fee == null){
	System.out.println(this.toString+" : as_fee is null" );
}else{
	System.out.println(this.toString+" : as_fee is "+as_fee );
}
String as_tel = req.getParameter("as_tel");
if( as_tel == null){
	System.out.println(this.toString+" : as_tel is null" );
}else{
	System.out.println(this.toString+" : as_tel is "+as_tel );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String file_size = req.getParameter("file_size");
if( file_size == null){
	System.out.println(this.toString+" : file_size is null" );
}else{
	System.out.println(this.toString+" : file_size is "+file_size );
}
String up_phot_img = req.getParameter("up_phot_img");
if( up_phot_img == null){
	System.out.println(this.toString+" : up_phot_img is null" );
}else{
	System.out.println(this.toString+" : up_phot_img is "+up_phot_img );
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
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mach_seq = Util.checkString(req.getParameter("mach_seq"));
String work_clsf = Util.checkString(req.getParameter("work_clsf"));
String mach_clsf = Util.checkString(req.getParameter("mach_clsf"));
String bldg_clsf = Util.checkString(req.getParameter("bldg_clsf"));
String mach_name = Util.checkString(req.getParameter("mach_name"));
String model_name = Util.checkString(req.getParameter("model_name"));
String stnd = Util.checkString(req.getParameter("stnd"));
String usag = Util.checkString(req.getParameter("usag"));
String loca = Util.checkString(req.getParameter("loca"));
String inst_dt = Util.checkString(req.getParameter("inst_dt"));
String exp_dt = Util.checkString(req.getParameter("exp_dt"));
String make_comp = Util.checkString(req.getParameter("make_comp"));
String inst_comp = Util.checkString(req.getParameter("inst_comp"));
String inst_fee = Util.checkString(req.getParameter("inst_fee"));
String as_comp = Util.checkString(req.getParameter("as_comp"));
String as_fee = Util.checkString(req.getParameter("as_fee"));
String as_tel = Util.checkString(req.getParameter("as_tel"));
String remk = Util.checkString(req.getParameter("remk"));
String file_size = Util.checkString(req.getParameter("file_size"));
String up_phot_img = Util.checkString(req.getParameter("up_phot_img"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mach_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("mach_seq")));
String work_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("work_clsf")));
String mach_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("mach_clsf")));
String bldg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_clsf")));
String mach_name = Util.Uni2Ksc(Util.checkString(req.getParameter("mach_name")));
String model_name = Util.Uni2Ksc(Util.checkString(req.getParameter("model_name")));
String stnd = Util.Uni2Ksc(Util.checkString(req.getParameter("stnd")));
String usag = Util.Uni2Ksc(Util.checkString(req.getParameter("usag")));
String loca = Util.Uni2Ksc(Util.checkString(req.getParameter("loca")));
String inst_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("inst_dt")));
String exp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("exp_dt")));
String make_comp = Util.Uni2Ksc(Util.checkString(req.getParameter("make_comp")));
String inst_comp = Util.Uni2Ksc(Util.checkString(req.getParameter("inst_comp")));
String inst_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("inst_fee")));
String as_comp = Util.Uni2Ksc(Util.checkString(req.getParameter("as_comp")));
String as_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("as_fee")));
String as_tel = Util.Uni2Ksc(Util.checkString(req.getParameter("as_tel")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String file_size = Util.Uni2Ksc(Util.checkString(req.getParameter("file_size")));
String up_phot_img = Util.Uni2Ksc(Util.checkString(req.getParameter("up_phot_img")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMach_seq(mach_seq);
dm.setWork_clsf(work_clsf);
dm.setMach_clsf(mach_clsf);
dm.setBldg_clsf(bldg_clsf);
dm.setMach_name(mach_name);
dm.setModel_name(model_name);
dm.setStnd(stnd);
dm.setUsag(usag);
dm.setLoca(loca);
dm.setInst_dt(inst_dt);
dm.setExp_dt(exp_dt);
dm.setMake_comp(make_comp);
dm.setInst_comp(inst_comp);
dm.setInst_fee(inst_fee);
dm.setAs_comp(as_comp);
dm.setAs_fee(as_fee);
dm.setAs_tel(as_tel);
dm.setRemk(remk);
dm.setFile_size(file_size);
dm.setUp_phot_img(up_phot_img);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setJob_clsf(job_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 10 16:42:49 KST 2015 */