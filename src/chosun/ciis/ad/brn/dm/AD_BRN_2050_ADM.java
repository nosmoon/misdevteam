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


package chosun.ciis.ad.brn.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BRN_2050_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rept_clsf;
	public String make_dt;
	public String rept_no;
	public String advcs_clsf;
	public String medi_clsf;
	public String chrg_pers;
	public String dlco_no;
	public String patr_chrg_pers;
	public String titl;
	public String cont;
	public String data_clsf;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String add_file_no1;
	public String add_file_no2;
	public String add_file_no3;
	public String add_file_no4;
	public String add_file_no5;
	public String add_file_nm1;
	public String add_file_nm2;
	public String add_file_nm3;
	public String add_file_nm4;
	public String add_file_nm5;
	public byte[] add_file1;
	public byte[] add_file2;
	public byte[] add_file3;
	public byte[] add_file4;
	public byte[] add_file5;
	public String file_delyn1;
	public String file_delyn2;
	public String file_delyn3;
	public String file_delyn4;
	public String file_delyn5;
	public String flag;

	public AD_BRN_2050_ADM(){}
	public AD_BRN_2050_ADM(String cmpy_cd, String rept_clsf, String make_dt, String rept_no, String advcs_clsf, String medi_clsf, String chrg_pers, String dlco_no, String patr_chrg_pers, String titl, String cont, String data_clsf, String incmg_pers, String incmg_pers_ip, String add_file_no1, String add_file_no2, String add_file_no3, String add_file_no4, String add_file_no5, String add_file_nm1, String add_file_nm2, String add_file_nm3, String add_file_nm4, String add_file_nm5, byte[] add_file1, byte[] add_file2, byte[] add_file3, byte[] add_file4, byte[] add_file5, String file_delyn1, String file_delyn2, String file_delyn3, String file_delyn4, String file_delyn5, String flag){
		this.cmpy_cd = cmpy_cd;
		this.rept_clsf = rept_clsf;
		this.make_dt = make_dt;
		this.rept_no = rept_no;
		this.advcs_clsf = advcs_clsf;
		this.medi_clsf = medi_clsf;
		this.chrg_pers = chrg_pers;
		this.dlco_no = dlco_no;
		this.patr_chrg_pers = patr_chrg_pers;
		this.titl = titl;
		this.cont = cont;
		this.data_clsf = data_clsf;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.add_file_no1 = add_file_no1;
		this.add_file_no2 = add_file_no2;
		this.add_file_no3 = add_file_no3;
		this.add_file_no4 = add_file_no4;
		this.add_file_no5 = add_file_no5;
		this.add_file_nm1 = add_file_nm1;
		this.add_file_nm2 = add_file_nm2;
		this.add_file_nm3 = add_file_nm3;
		this.add_file_nm4 = add_file_nm4;
		this.add_file_nm5 = add_file_nm5;
		this.add_file1 = add_file1;
		this.add_file2 = add_file2;
		this.add_file3 = add_file3;
		this.add_file4 = add_file4;
		this.add_file5 = add_file5;
		this.file_delyn1 = file_delyn1;
		this.file_delyn2 = file_delyn2;
		this.file_delyn3 = file_delyn3;
		this.file_delyn4 = file_delyn4;
		this.file_delyn5 = file_delyn5;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRept_clsf(String rept_clsf){
		this.rept_clsf = rept_clsf;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setRept_no(String rept_no){
		this.rept_no = rept_no;
	}

	public void setAdvcs_clsf(String advcs_clsf){
		this.advcs_clsf = advcs_clsf;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setPatr_chrg_pers(String patr_chrg_pers){
		this.patr_chrg_pers = patr_chrg_pers;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setData_clsf(String data_clsf){
		this.data_clsf = data_clsf;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setAdd_file_no1(String add_file_no1){
		this.add_file_no1 = add_file_no1;
	}

	public void setAdd_file_no2(String add_file_no2){
		this.add_file_no2 = add_file_no2;
	}

	public void setAdd_file_no3(String add_file_no3){
		this.add_file_no3 = add_file_no3;
	}

	public void setAdd_file_no4(String add_file_no4){
		this.add_file_no4 = add_file_no4;
	}

	public void setAdd_file_no5(String add_file_no5){
		this.add_file_no5 = add_file_no5;
	}

	public void setAdd_file_nm1(String add_file_nm1){
		this.add_file_nm1 = add_file_nm1;
	}

	public void setAdd_file_nm2(String add_file_nm2){
		this.add_file_nm2 = add_file_nm2;
	}

	public void setAdd_file_nm3(String add_file_nm3){
		this.add_file_nm3 = add_file_nm3;
	}

	public void setAdd_file_nm4(String add_file_nm4){
		this.add_file_nm4 = add_file_nm4;
	}

	public void setAdd_file_nm5(String add_file_nm5){
		this.add_file_nm5 = add_file_nm5;
	}

	public void setAdd_file1(byte[] add_file1){
		this.add_file1 = add_file1;
	}

	public void setAdd_file2(byte[] add_file2){
		this.add_file2 = add_file2;
	}

	public void setAdd_file3(byte[] add_file3){
		this.add_file3 = add_file3;
	}

	public void setAdd_file4(byte[] add_file4){
		this.add_file4 = add_file4;
	}

	public void setAdd_file5(byte[] add_file5){
		this.add_file5 = add_file5;
	}

	public void setFile_delyn1(String file_delyn1){
		this.file_delyn1 = file_delyn1;
	}

	public void setFile_delyn2(String file_delyn2){
		this.file_delyn2 = file_delyn2;
	}

	public void setFile_delyn3(String file_delyn3){
		this.file_delyn3 = file_delyn3;
	}

	public void setFile_delyn4(String file_delyn4){
		this.file_delyn4 = file_delyn4;
	}

	public void setFile_delyn5(String file_delyn5){
		this.file_delyn5 = file_delyn5;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRept_clsf(){
		return this.rept_clsf;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getRept_no(){
		return this.rept_no;
	}

	public String getAdvcs_clsf(){
		return this.advcs_clsf;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getPatr_chrg_pers(){
		return this.patr_chrg_pers;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont(){
		return this.cont;
	}

	public String getData_clsf(){
		return this.data_clsf;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getAdd_file_no1(){
		return this.add_file_no1;
	}

	public String getAdd_file_no2(){
		return this.add_file_no2;
	}

	public String getAdd_file_no3(){
		return this.add_file_no3;
	}

	public String getAdd_file_no4(){
		return this.add_file_no4;
	}

	public String getAdd_file_no5(){
		return this.add_file_no5;
	}

	public String getAdd_file_nm1(){
		return this.add_file_nm1;
	}

	public String getAdd_file_nm2(){
		return this.add_file_nm2;
	}

	public String getAdd_file_nm3(){
		return this.add_file_nm3;
	}

	public String getAdd_file_nm4(){
		return this.add_file_nm4;
	}

	public String getAdd_file_nm5(){
		return this.add_file_nm5;
	}

	public byte[] getAdd_file1(){
		return this.add_file1;
	}

	public byte[] getAdd_file2(){
		return this.add_file2;
	}

	public byte[] getAdd_file3(){
		return this.add_file3;
	}

	public byte[] getAdd_file4(){
		return this.add_file4;
	}

	public byte[] getAdd_file5(){
		return this.add_file5;
	}

	public String getFile_delyn1(){
		return this.file_delyn1;
	}

	public String getFile_delyn2(){
		return this.file_delyn2;
	}

	public String getFile_delyn3(){
		return this.file_delyn3;
	}

	public String getFile_delyn4(){
		return this.file_delyn4;
	}

	public String getFile_delyn5(){
		return this.file_delyn5;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BRN_2050_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BRN_2050_ADM dm = (AD_BRN_2050_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rept_clsf);
		cstmt.setString(5, dm.make_dt);
		cstmt.setString(6, dm.rept_no);
		cstmt.setString(7, dm.advcs_clsf);
		cstmt.setString(8, dm.medi_clsf);
		cstmt.setString(9, dm.chrg_pers);
		cstmt.setString(10, dm.dlco_no);
		cstmt.setString(11, dm.patr_chrg_pers);
		cstmt.setString(12, dm.titl);
		cstmt.setString(13, dm.cont);
		cstmt.setString(14, dm.data_clsf);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.setString(16, dm.incmg_pers_ip);
		cstmt.setString(17, dm.add_file_no1);
		cstmt.setString(18, dm.add_file_no2);
		cstmt.setString(19, dm.add_file_no3);
		cstmt.setString(20, dm.add_file_no4);
		cstmt.setString(21, dm.add_file_no5);
		cstmt.setString(22, dm.add_file_nm1);
		cstmt.setString(23, dm.add_file_nm2);
		cstmt.setString(24, dm.add_file_nm3);
		cstmt.setString(25, dm.add_file_nm4);
		cstmt.setString(26, dm.add_file_nm5);
		cstmt.setBytes(27, "0101".getBytes());
		cstmt.setBytes(28, "0101".getBytes());
		cstmt.setBytes(29, "0101".getBytes());
		cstmt.setBytes(30, "0101".getBytes());
		cstmt.setBytes(31, "0101".getBytes());
		cstmt.setString(32, dm.file_delyn1);
		cstmt.setString(33, dm.file_delyn2);
		cstmt.setString(34, dm.file_delyn3);
		cstmt.setString(35, dm.file_delyn4);
		cstmt.setString(36, dm.file_delyn5);
		cstmt.setString(37, dm.flag);
		cstmt.registerOutParameter(38, Types.VARCHAR);
		cstmt.registerOutParameter(39, Types.VARCHAR);
		cstmt.registerOutParameter(40, Types.VARCHAR);
		cstmt.registerOutParameter(41, Types.VARCHAR);
		cstmt.registerOutParameter(42, Types.VARCHAR);
		cstmt.registerOutParameter(43, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.brn.ds.AD_BRN_2050_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rept_clsf = [" + getRept_clsf() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("rept_no = [" + getRept_no() + "]");
		System.out.println("advcs_clsf = [" + getAdvcs_clsf() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("patr_chrg_pers = [" + getPatr_chrg_pers() + "]");
		System.out.println("titl = [" + getTitl() + "]");
		System.out.println("cont = [" + getCont() + "]");
		System.out.println("data_clsf = [" + getData_clsf() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("add_file_no1 = [" + getAdd_file_no1() + "]");
		System.out.println("add_file_no2 = [" + getAdd_file_no2() + "]");
		System.out.println("add_file_no3 = [" + getAdd_file_no3() + "]");
		System.out.println("add_file_no4 = [" + getAdd_file_no4() + "]");
		System.out.println("add_file_no5 = [" + getAdd_file_no5() + "]");
		System.out.println("add_file_nm1 = [" + getAdd_file_nm1() + "]");
		System.out.println("add_file_nm2 = [" + getAdd_file_nm2() + "]");
		System.out.println("add_file_nm3 = [" + getAdd_file_nm3() + "]");
		System.out.println("add_file_nm4 = [" + getAdd_file_nm4() + "]");
		System.out.println("add_file_nm5 = [" + getAdd_file_nm5() + "]");
		System.out.println("add_file1 = [" + getAdd_file1() + "]");
		System.out.println("add_file2 = [" + getAdd_file2() + "]");
		System.out.println("add_file3 = [" + getAdd_file3() + "]");
		System.out.println("add_file4 = [" + getAdd_file4() + "]");
		System.out.println("add_file5 = [" + getAdd_file5() + "]");
		System.out.println("file_delyn1 = [" + getFile_delyn1() + "]");
		System.out.println("file_delyn2 = [" + getFile_delyn2() + "]");
		System.out.println("file_delyn3 = [" + getFile_delyn3() + "]");
		System.out.println("file_delyn4 = [" + getFile_delyn4() + "]");
		System.out.println("file_delyn5 = [" + getFile_delyn5() + "]");
		System.out.println("flag = [" + getFlag() + "]");
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
String rept_clsf = req.getParameter("rept_clsf");
if( rept_clsf == null){
	System.out.println(this.toString+" : rept_clsf is null" );
}else{
	System.out.println(this.toString+" : rept_clsf is "+rept_clsf );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String rept_no = req.getParameter("rept_no");
if( rept_no == null){
	System.out.println(this.toString+" : rept_no is null" );
}else{
	System.out.println(this.toString+" : rept_no is "+rept_no );
}
String advcs_clsf = req.getParameter("advcs_clsf");
if( advcs_clsf == null){
	System.out.println(this.toString+" : advcs_clsf is null" );
}else{
	System.out.println(this.toString+" : advcs_clsf is "+advcs_clsf );
}
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String patr_chrg_pers = req.getParameter("patr_chrg_pers");
if( patr_chrg_pers == null){
	System.out.println(this.toString+" : patr_chrg_pers is null" );
}else{
	System.out.println(this.toString+" : patr_chrg_pers is "+patr_chrg_pers );
}
String titl = req.getParameter("titl");
if( titl == null){
	System.out.println(this.toString+" : titl is null" );
}else{
	System.out.println(this.toString+" : titl is "+titl );
}
String cont = req.getParameter("cont");
if( cont == null){
	System.out.println(this.toString+" : cont is null" );
}else{
	System.out.println(this.toString+" : cont is "+cont );
}
String data_clsf = req.getParameter("data_clsf");
if( data_clsf == null){
	System.out.println(this.toString+" : data_clsf is null" );
}else{
	System.out.println(this.toString+" : data_clsf is "+data_clsf );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String add_file_no1 = req.getParameter("add_file_no1");
if( add_file_no1 == null){
	System.out.println(this.toString+" : add_file_no1 is null" );
}else{
	System.out.println(this.toString+" : add_file_no1 is "+add_file_no1 );
}
String add_file_no2 = req.getParameter("add_file_no2");
if( add_file_no2 == null){
	System.out.println(this.toString+" : add_file_no2 is null" );
}else{
	System.out.println(this.toString+" : add_file_no2 is "+add_file_no2 );
}
String add_file_no3 = req.getParameter("add_file_no3");
if( add_file_no3 == null){
	System.out.println(this.toString+" : add_file_no3 is null" );
}else{
	System.out.println(this.toString+" : add_file_no3 is "+add_file_no3 );
}
String add_file_no4 = req.getParameter("add_file_no4");
if( add_file_no4 == null){
	System.out.println(this.toString+" : add_file_no4 is null" );
}else{
	System.out.println(this.toString+" : add_file_no4 is "+add_file_no4 );
}
String add_file_no5 = req.getParameter("add_file_no5");
if( add_file_no5 == null){
	System.out.println(this.toString+" : add_file_no5 is null" );
}else{
	System.out.println(this.toString+" : add_file_no5 is "+add_file_no5 );
}
String add_file_nm1 = req.getParameter("add_file_nm1");
if( add_file_nm1 == null){
	System.out.println(this.toString+" : add_file_nm1 is null" );
}else{
	System.out.println(this.toString+" : add_file_nm1 is "+add_file_nm1 );
}
String add_file_nm2 = req.getParameter("add_file_nm2");
if( add_file_nm2 == null){
	System.out.println(this.toString+" : add_file_nm2 is null" );
}else{
	System.out.println(this.toString+" : add_file_nm2 is "+add_file_nm2 );
}
String add_file_nm3 = req.getParameter("add_file_nm3");
if( add_file_nm3 == null){
	System.out.println(this.toString+" : add_file_nm3 is null" );
}else{
	System.out.println(this.toString+" : add_file_nm3 is "+add_file_nm3 );
}
String add_file_nm4 = req.getParameter("add_file_nm4");
if( add_file_nm4 == null){
	System.out.println(this.toString+" : add_file_nm4 is null" );
}else{
	System.out.println(this.toString+" : add_file_nm4 is "+add_file_nm4 );
}
String add_file_nm5 = req.getParameter("add_file_nm5");
if( add_file_nm5 == null){
	System.out.println(this.toString+" : add_file_nm5 is null" );
}else{
	System.out.println(this.toString+" : add_file_nm5 is "+add_file_nm5 );
}
String add_file1 = req.getParameter("add_file1");
if( add_file1 == null){
	System.out.println(this.toString+" : add_file1 is null" );
}else{
	System.out.println(this.toString+" : add_file1 is "+add_file1 );
}
String add_file2 = req.getParameter("add_file2");
if( add_file2 == null){
	System.out.println(this.toString+" : add_file2 is null" );
}else{
	System.out.println(this.toString+" : add_file2 is "+add_file2 );
}
String add_file3 = req.getParameter("add_file3");
if( add_file3 == null){
	System.out.println(this.toString+" : add_file3 is null" );
}else{
	System.out.println(this.toString+" : add_file3 is "+add_file3 );
}
String add_file4 = req.getParameter("add_file4");
if( add_file4 == null){
	System.out.println(this.toString+" : add_file4 is null" );
}else{
	System.out.println(this.toString+" : add_file4 is "+add_file4 );
}
String add_file5 = req.getParameter("add_file5");
if( add_file5 == null){
	System.out.println(this.toString+" : add_file5 is null" );
}else{
	System.out.println(this.toString+" : add_file5 is "+add_file5 );
}
String file_delyn1 = req.getParameter("file_delyn1");
if( file_delyn1 == null){
	System.out.println(this.toString+" : file_delyn1 is null" );
}else{
	System.out.println(this.toString+" : file_delyn1 is "+file_delyn1 );
}
String file_delyn2 = req.getParameter("file_delyn2");
if( file_delyn2 == null){
	System.out.println(this.toString+" : file_delyn2 is null" );
}else{
	System.out.println(this.toString+" : file_delyn2 is "+file_delyn2 );
}
String file_delyn3 = req.getParameter("file_delyn3");
if( file_delyn3 == null){
	System.out.println(this.toString+" : file_delyn3 is null" );
}else{
	System.out.println(this.toString+" : file_delyn3 is "+file_delyn3 );
}
String file_delyn4 = req.getParameter("file_delyn4");
if( file_delyn4 == null){
	System.out.println(this.toString+" : file_delyn4 is null" );
}else{
	System.out.println(this.toString+" : file_delyn4 is "+file_delyn4 );
}
String file_delyn5 = req.getParameter("file_delyn5");
if( file_delyn5 == null){
	System.out.println(this.toString+" : file_delyn5 is null" );
}else{
	System.out.println(this.toString+" : file_delyn5 is "+file_delyn5 );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rept_clsf = Util.checkString(req.getParameter("rept_clsf"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String rept_no = Util.checkString(req.getParameter("rept_no"));
String advcs_clsf = Util.checkString(req.getParameter("advcs_clsf"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String patr_chrg_pers = Util.checkString(req.getParameter("patr_chrg_pers"));
String titl = Util.checkString(req.getParameter("titl"));
String cont = Util.checkString(req.getParameter("cont"));
String data_clsf = Util.checkString(req.getParameter("data_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String add_file_no1 = Util.checkString(req.getParameter("add_file_no1"));
String add_file_no2 = Util.checkString(req.getParameter("add_file_no2"));
String add_file_no3 = Util.checkString(req.getParameter("add_file_no3"));
String add_file_no4 = Util.checkString(req.getParameter("add_file_no4"));
String add_file_no5 = Util.checkString(req.getParameter("add_file_no5"));
String add_file_nm1 = Util.checkString(req.getParameter("add_file_nm1"));
String add_file_nm2 = Util.checkString(req.getParameter("add_file_nm2"));
String add_file_nm3 = Util.checkString(req.getParameter("add_file_nm3"));
String add_file_nm4 = Util.checkString(req.getParameter("add_file_nm4"));
String add_file_nm5 = Util.checkString(req.getParameter("add_file_nm5"));
String add_file1 = Util.checkString(req.getParameter("add_file1"));
String add_file2 = Util.checkString(req.getParameter("add_file2"));
String add_file3 = Util.checkString(req.getParameter("add_file3"));
String add_file4 = Util.checkString(req.getParameter("add_file4"));
String add_file5 = Util.checkString(req.getParameter("add_file5"));
String file_delyn1 = Util.checkString(req.getParameter("file_delyn1"));
String file_delyn2 = Util.checkString(req.getParameter("file_delyn2"));
String file_delyn3 = Util.checkString(req.getParameter("file_delyn3"));
String file_delyn4 = Util.checkString(req.getParameter("file_delyn4"));
String file_delyn5 = Util.checkString(req.getParameter("file_delyn5"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rept_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_clsf")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String rept_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_no")));
String advcs_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_clsf")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String patr_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("patr_chrg_pers")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
String data_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("data_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String add_file_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_no1")));
String add_file_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_no2")));
String add_file_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_no3")));
String add_file_no4 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_no4")));
String add_file_no5 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_no5")));
String add_file_nm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_nm1")));
String add_file_nm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_nm2")));
String add_file_nm3 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_nm3")));
String add_file_nm4 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_nm4")));
String add_file_nm5 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_nm5")));
String add_file1 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file1")));
String add_file2 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file2")));
String add_file3 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file3")));
String add_file4 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file4")));
String add_file5 = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file5")));
String file_delyn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("file_delyn1")));
String file_delyn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("file_delyn2")));
String file_delyn3 = Util.Uni2Ksc(Util.checkString(req.getParameter("file_delyn3")));
String file_delyn4 = Util.Uni2Ksc(Util.checkString(req.getParameter("file_delyn4")));
String file_delyn5 = Util.Uni2Ksc(Util.checkString(req.getParameter("file_delyn5")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRept_clsf(rept_clsf);
dm.setMake_dt(make_dt);
dm.setRept_no(rept_no);
dm.setAdvcs_clsf(advcs_clsf);
dm.setMedi_clsf(medi_clsf);
dm.setChrg_pers(chrg_pers);
dm.setDlco_no(dlco_no);
dm.setPatr_chrg_pers(patr_chrg_pers);
dm.setTitl(titl);
dm.setCont(cont);
dm.setData_clsf(data_clsf);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setAdd_file_no1(add_file_no1);
dm.setAdd_file_no2(add_file_no2);
dm.setAdd_file_no3(add_file_no3);
dm.setAdd_file_no4(add_file_no4);
dm.setAdd_file_no5(add_file_no5);
dm.setAdd_file_nm1(add_file_nm1);
dm.setAdd_file_nm2(add_file_nm2);
dm.setAdd_file_nm3(add_file_nm3);
dm.setAdd_file_nm4(add_file_nm4);
dm.setAdd_file_nm5(add_file_nm5);
dm.setAdd_file1(add_file1);
dm.setAdd_file2(add_file2);
dm.setAdd_file3(add_file3);
dm.setAdd_file4(add_file4);
dm.setAdd_file5(add_file5);
dm.setFile_delyn1(file_delyn1);
dm.setFile_delyn2(file_delyn2);
dm.setFile_delyn3(file_delyn3);
dm.setFile_delyn4(file_delyn4);
dm.setFile_delyn5(file_delyn5);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 23 09:27:32 KST 2009 */