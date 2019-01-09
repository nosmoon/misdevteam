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


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_6020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String dept_cd;
	public String dlco_clsf;
	public String dlco_no;
	public String chrg_pers;
	public String patr_chrg_pers;
	public String titl;
	public String cont;
	public String tag;
	public String team_chf_yn;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String flag;
	public String add_file_no1;
	public String add_file_nm1;
	public byte[] add_file1;
	public String add_file_no2;
	public String add_file_nm2;
	public byte[] add_file2;
	public String add_file_no3;
	public String add_file_nm3;
	public byte[] add_file3;
	public String add_file_no4;
	public String add_file_nm4;
	public byte[] add_file4;
	public String add_file_no5;
	public String add_file_nm5;
	public byte[] add_file5;
	public String add_file_no6;
	public String add_file_nm6;
	public byte[] add_file6;
	public String add_file_no7;
	public String add_file_nm7;
	public byte[] add_file7;
	public String add_file_no8;
	public String add_file_nm8;
	public byte[] add_file8;
	public String add_file_no9;
	public String add_file_nm9;
	public byte[] add_file9;
	public String add_file_no10;
	public String add_file_nm10;
	public byte[] add_file10;
	public String file_delyn1;
	public String file_delyn2;
	public String file_delyn3;
	public String file_delyn4;
	public String file_delyn5;
	public String file_delyn6;
	public String file_delyn7;
	public String file_delyn8;
	public String file_delyn9;
	public String file_delyn10;

	public MT_COMMATR_6020_ADM(){}
	public MT_COMMATR_6020_ADM(String cmpy_cd, String occr_dt, String seq, String dept_cd, String dlco_clsf, String dlco_no, String chrg_pers, String patr_chrg_pers, String titl, String cont, String tag, String team_chf_yn, String incmg_pers, String incmg_pers_ip, String flag, String add_file_no1, String add_file_nm1, byte[] add_file1, String add_file_no2, String add_file_nm2, byte[] add_file2, String add_file_no3, String add_file_nm3, byte[] add_file3, String add_file_no4, String add_file_nm4, byte[] add_file4, String add_file_no5, String add_file_nm5, byte[] add_file5, String add_file_no6, String add_file_nm6, byte[] add_file6, String add_file_no7, String add_file_nm7, byte[] add_file7, String add_file_no8, String add_file_nm8, byte[] add_file8, String add_file_no9, String add_file_nm9, byte[] add_file9, String add_file_no10, String add_file_nm10,  byte[] add_file10, String file_delyn1, String file_delyn2, String file_delyn3, String file_delyn4, String file_delyn5, String file_delyn6, String file_delyn7, String file_delyn8, String file_delyn9, String file_delyn10){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.dept_cd = dept_cd;
		this.dlco_clsf = dlco_clsf;
		this.dlco_no = dlco_no;
		this.chrg_pers = chrg_pers;
		this.patr_chrg_pers = patr_chrg_pers;
		this.titl = titl;
		this.cont = cont;
		this.tag = tag;
		this.team_chf_yn = team_chf_yn;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.flag = flag;
		this.add_file_no1 = add_file_no1;
		this.add_file_nm1 = add_file_nm1;
		this.add_file1 = add_file1;
		this.add_file_no2 = add_file_no2;
		this.add_file_nm2 = add_file_nm2;
		this.add_file2 = add_file2;
		this.add_file_no3 = add_file_no3;
		this.add_file_nm3 = add_file_nm3;
		this.add_file3 = add_file3;
		this.add_file_no4 = add_file_no4;
		this.add_file_nm4 = add_file_nm4;
		this.add_file4 = add_file4;
		this.add_file_no5 = add_file_no5;
		this.add_file_nm5 = add_file_nm5;
		this.add_file5 = add_file5;
		this.add_file_no6 = add_file_no6;
		this.add_file_nm6 = add_file_nm6;
		this.add_file6 = add_file6;
		this.add_file_no7 = add_file_no7;
		this.add_file_nm7 = add_file_nm7;
		this.add_file7 = add_file7;
		this.add_file_no8 = add_file_no8;
		this.add_file_nm8 = add_file_nm8;
		this.add_file8 = add_file8;
		this.add_file_no9 = add_file_no9;
		this.add_file_nm9 = add_file_nm9;
		this.add_file9 = add_file9;
		this.add_file_no10 = add_file_no10;
		this.add_file_nm10 = add_file_nm10;
		this.add_file10 = add_file10;
		this.file_delyn1 = file_delyn1;
		this.file_delyn2 = file_delyn2;
		this.file_delyn3 = file_delyn3;
		this.file_delyn4 = file_delyn4;
		this.file_delyn5 = file_delyn5;
		this.file_delyn6 = file_delyn6;
		this.file_delyn7 = file_delyn7;
		this.file_delyn8 = file_delyn8;
		this.file_delyn9 = file_delyn9;
		this.file_delyn10 = file_delyn10;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
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

	public void setTag(String tag){
		this.tag = tag;
	}
	
	public void setTeam_chf_yn(String team_chf_yn){
		this.team_chf_yn = team_chf_yn;
	}
	
	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setAdd_file_no1(String add_file_no1){
		this.add_file_no1 = add_file_no1;
	}

	public void setAdd_file_nm1(String add_file_nm1){
		this.add_file_nm1 = add_file_nm1;
	}

	public void setAdd_file1(byte[] add_file1){
		this.add_file1 = add_file1;
	}
	
	public void setAdd_file_no2(String add_file_no2){
		this.add_file_no2 = add_file_no2;
	}

	public void setAdd_file_nm2(String add_file_nm2){
		this.add_file_nm2 = add_file_nm2;
	}

	public void setAdd_file2(byte[] add_file2){
		this.add_file2 = add_file2;
	}
	
	public void setAdd_file_no3(String add_file_no3){
		this.add_file_no3 = add_file_no3;
	}

	public void setAdd_file_nm3(String add_file_nm3){
		this.add_file_nm3 = add_file_nm3;
	}

	public void setAdd_file3(byte[] add_file3){
		this.add_file3 = add_file3;
	}
	
	public void setAdd_file_no4(String add_file_no4){
		this.add_file_no4 = add_file_no4;
	}

	public void setAdd_file_nm4(String add_file_nm4){
		this.add_file_nm4 = add_file_nm4;
	}

	public void setAdd_file4(byte[] add_file4){
		this.add_file4 = add_file4;
	}
	
	public void setAdd_file_no5(String add_file_no5){
		this.add_file_no5 = add_file_no5;
	}

	public void setAdd_file_nm5(String add_file_nm5){
		this.add_file_nm5 = add_file_nm5;
	}

	public void setAdd_file5(byte[] add_file5){
		this.add_file5 = add_file5;
	}
		
	public void setAdd_file_no6(String add_file_no6){
		this.add_file_no6 = add_file_no6;
	}

	public void setAdd_file_nm6(String add_file_nm6){
		this.add_file_nm6 = add_file_nm6;
	}

	public void setAdd_file6(byte[] add_file6){
		this.add_file6 = add_file6;
	}
	
	public void setAdd_file_no7(String add_file_no7){
		this.add_file_no7 = add_file_no7;
	}

	public void setAdd_file_nm7(String add_file_nm7){
		this.add_file_nm7 = add_file_nm7;
	}

	public void setAdd_file7(byte[] add_file7){
		this.add_file7 = add_file7;
	}
	
	public void setAdd_file_no8(String add_file_no8){
		this.add_file_no8 = add_file_no8;
	}

	public void setAdd_file_nm8(String add_file_nm8){
		this.add_file_nm8 = add_file_nm8;
	}

	public void setAdd_file8(byte[] add_file8){
		this.add_file8 = add_file8;
	}
	
	public void setAdd_file_no9(String add_file_no9){
		this.add_file_no9 = add_file_no9;
	}

	public void setAdd_file_nm9(String add_file_nm9){
		this.add_file_nm9 = add_file_nm9;
	}

	public void setAdd_file9(byte[] add_file9){
		this.add_file9 = add_file9;
	}
	
	public void setAdd_file_no10(String add_file_no10){
		this.add_file_no10 = add_file_no10;
	}

	public void setAdd_file_nm10(String add_file_nm10){
		this.add_file_nm10 = add_file_nm10;
	}

	public void setAdd_file10(byte[] add_file10){
		this.add_file10 = add_file10;
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
	
	public void setFile_delyn6(String file_delyn6){
		this.file_delyn6 = file_delyn6;
	}

	public void setFile_delyn7(String file_delyn7){
		this.file_delyn7 = file_delyn7;
	}

	public void setFile_delyn8(String file_delyn8){
		this.file_delyn8 = file_delyn8;
	}

	public void setFile_delyn9(String file_delyn9){
		this.file_delyn9 = file_delyn9;
	}

	public void setFile_delyn10(String file_delyn10){
		this.file_delyn10 = file_delyn10;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
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

	public String getTag(){
		return this.tag;
	}
	
	public String getTeam_chf_yn(){
		return this.team_chf_yn;
	}
	
	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getAdd_file_no1(){
		return this.add_file_no1;
	}
	
	public String getAdd_file_nm1(){
		return this.add_file_nm1;
	}

	public byte[] getAdd_file1(){
		return this.add_file1;
	}

	public String getAdd_file_no2(){
		return this.add_file_no2;
	}
	
	public String getAdd_file_nm2(){
		return this.add_file_nm2;
	}

	public byte[] getAdd_file2(){
		return this.add_file1;
	}

	public String getAdd_file_no3(){
		return this.add_file_no3;
	}
	
	public String getAdd_file_nm3(){
		return this.add_file_nm3;
	}

	public byte[] getAdd_file3(){
		return this.add_file3;
	}

	public String getAdd_file_no4(){
		return this.add_file_no4;
	}
	
	public String getAdd_file_nm4(){
		return this.add_file_nm4;
	}

	public byte[] getAdd_file4(){
		return this.add_file4;
	}

	public String getAdd_file_no5(){
		return this.add_file_no5;
	}
	
	public String getAdd_file_nm5(){
		return this.add_file_nm5;
	}

	public byte[] getAdd_file5(){
		return this.add_file5;
	}

	public String getAdd_file_no6(){
		return this.add_file_no6;
	}
	
	public String getAdd_file_nm6(){
		return this.add_file_nm6;
	}

	public byte[] getAdd_file6(){
		return this.add_file6;
	}

	public String getAdd_file_no7(){
		return this.add_file_no7;
	}
	
	public String getAdd_file_nm7(){
		return this.add_file_nm7;
	}

	public byte[] getAdd_file7(){
		return this.add_file7;
	}
	
	public String getAdd_file_no8(){
		return this.add_file_no8;
	}
	
	public String getAdd_file_nm8(){
		return this.add_file_nm8;
	}

	public byte[] getAdd_file8(){
		return this.add_file8;
	}
	
	public String getAdd_file_no9(){
		return this.add_file_no9;
	}
	
	public String getAdd_file_nm9(){
		return this.add_file_nm9;
	}

	public byte[] getAdd_file9(){
		return this.add_file9;
	}
	
	public String getAdd_file_no10(){
		return this.add_file_no10;
	}
	
	public String getAdd_file_nm10(){
		return this.add_file_nm10;
	}

	public byte[] getAdd_file10(){
		return this.add_file10;
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
	
	public String getFile_delyn6(){
		return this.file_delyn6;
	}
	
	public String getFile_delyn7(){
		return this.file_delyn7;
	}

	public String getFile_delyn8(){
		return this.file_delyn8;
	}

	public String getFile_delyn9(){
		return this.file_delyn9;
	}

	public String getFile_delyn10(){
		return this.file_delyn10;
	}

	
	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_6020_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_6020_ADM dm = (MT_COMMATR_6020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.dlco_clsf);
		cstmt.setString(8, dm.dlco_no);
		cstmt.setString(9, dm.chrg_pers);
		cstmt.setString(10, dm.patr_chrg_pers);
		cstmt.setString(11, dm.titl);
		cstmt.setString(12, dm.cont);
		cstmt.setString(13, dm.tag);
		cstmt.setString(14, dm.team_chf_yn);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.setString(16, dm.incmg_pers_ip);
		cstmt.setString(17, dm.flag);
		cstmt.setString(18, dm.add_file_no1);
		cstmt.setString(19, dm.add_file_nm1);
		cstmt.setBytes(20, "0101".getBytes());
		cstmt.setString(21, dm.add_file_no2);
		cstmt.setString(22, dm.add_file_nm2);
		cstmt.setBytes(23, "0101".getBytes());
		cstmt.setString(24, dm.add_file_no3);
		cstmt.setString(25, dm.add_file_nm3);
		cstmt.setBytes(26, "0101".getBytes());
		cstmt.setString(27, dm.add_file_no4);
		cstmt.setString(28, dm.add_file_nm4);
		cstmt.setBytes(29, "0101".getBytes());
		cstmt.setString(30, dm.add_file_no5);
		cstmt.setString(31, dm.add_file_nm5);
		cstmt.setBytes(32, "0101".getBytes());
		cstmt.setString(33, dm.add_file_no6);
		cstmt.setString(34, dm.add_file_nm6);
		cstmt.setBytes(35, "0101".getBytes());
		cstmt.setString(36, dm.add_file_no7);
		cstmt.setString(37, dm.add_file_nm7);
		cstmt.setBytes(38, "0101".getBytes());
		cstmt.setString(39, dm.add_file_no8);
		cstmt.setString(40, dm.add_file_nm8);
		cstmt.setBytes(41, "0101".getBytes());
		cstmt.setString(42, dm.add_file_no9);
		cstmt.setString(43, dm.add_file_nm9);
		cstmt.setBytes(44, "0101".getBytes());
		cstmt.setString(45, dm.add_file_no10);
		cstmt.setString(46, dm.add_file_nm10);
		cstmt.setBytes(47, "0101".getBytes());
		cstmt.setString(48, dm.file_delyn1);
		cstmt.setString(49, dm.file_delyn2);
		cstmt.setString(50, dm.file_delyn3);
		cstmt.setString(51, dm.file_delyn4);
		cstmt.setString(52, dm.file_delyn5);
		cstmt.setString(53, dm.file_delyn6);
		cstmt.setString(54, dm.file_delyn7);
		cstmt.setString(55, dm.file_delyn8);
		cstmt.setString(56, dm.file_delyn9);
		cstmt.setString(57, dm.file_delyn10);
		cstmt.registerOutParameter(58, Types.VARCHAR);
		cstmt.registerOutParameter(59, Types.VARCHAR);
		cstmt.registerOutParameter(60, Types.VARCHAR);
		cstmt.registerOutParameter(61, Types.VARCHAR);
		cstmt.registerOutParameter(62, Types.VARCHAR);
		cstmt.registerOutParameter(63, Types.VARCHAR);
		cstmt.registerOutParameter(64, Types.VARCHAR);
		cstmt.registerOutParameter(65, Types.VARCHAR);
		cstmt.registerOutParameter(66, Types.VARCHAR);
		cstmt.registerOutParameter(67, Types.VARCHAR);
		cstmt.registerOutParameter(68, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_6020_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("patr_chrg_pers = [" + getPatr_chrg_pers() + "]");
		System.out.println("titl = [" + getTitl() + "]");
		System.out.println("cont = [" + getCont() + "]");
		System.out.println("tag = [" + getTag() + "]");
		System.out.println("team_chf_yn = [" + getTeam_chf_yn() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("add_file_no1 = [" + getAdd_file_no1() + "]");
		System.out.println("add_file_nm1 = [" + getAdd_file_nm1() + "]");
		System.out.println("add_file_no2 = [" + getAdd_file_no2() + "]");
		System.out.println("add_file_nm2 = [" + getAdd_file_nm2() + "]");
		System.out.println("add_file_no3 = [" + getAdd_file_no3() + "]");
		System.out.println("add_file_nm3 = [" + getAdd_file_nm3() + "]");
		System.out.println("add_file_no4 = [" + getAdd_file_no4() + "]");
		System.out.println("add_file_nm4 = [" + getAdd_file_nm4() + "]");
		System.out.println("add_file_no5 = [" + getAdd_file_no5() + "]");
		System.out.println("add_file_nm5 = [" + getAdd_file_nm5() + "]");
		System.out.println("add_file_no6 = [" + getAdd_file_no6() + "]");
		System.out.println("add_file_no6 = [" + getAdd_file_nm6() + "]");
		System.out.println("add_file_no7 = [" + getAdd_file_no7() + "]");
		System.out.println("add_file_no7 = [" + getAdd_file_nm7() + "]");
		System.out.println("add_file_no8 = [" + getAdd_file_no8() + "]");
		System.out.println("add_file_no8 = [" + getAdd_file_nm8() + "]");
		System.out.println("add_file_no9 = [" + getAdd_file_no9() + "]");
		System.out.println("add_file_no9 = [" + getAdd_file_nm9() + "]");
		System.out.println("add_file_no10 = [" + getAdd_file_no10() + "]");
		System.out.println("add_file_no10 = [" + getAdd_file_nm10() + "]");
		System.out.println("file_delyn1 = [" + getFile_delyn1() + "]");
		System.out.println("file_delyn2 = [" + getFile_delyn2() + "]");
		System.out.println("file_delyn3 = [" + getFile_delyn3() + "]");
		System.out.println("file_delyn4 = [" + getFile_delyn4() + "]");
		System.out.println("file_delyn5 = [" + getFile_delyn5() + "]");
		System.out.println("file_delyn6 = [" + getFile_delyn6() + "]");
		System.out.println("file_delyn7 = [" + getFile_delyn7() + "]");
		System.out.println("file_delyn8 = [" + getFile_delyn8() + "]");
		System.out.println("file_delyn9 = [" + getFile_delyn9() + "]");
		System.out.println("file_delyn10 = [" + getFile_delyn10() + "]");
		
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
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
String tag = req.getParameter("tag");
if( tag == null){
	System.out.println(this.toString+" : tag is null" );
}else{
	System.out.println(this.toString+" : tag is "+tag );
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
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String patr_chrg_pers = Util.checkString(req.getParameter("patr_chrg_pers"));
String titl = Util.checkString(req.getParameter("titl"));
String cont = Util.checkString(req.getParameter("cont"));
String tag = Util.checkString(req.getParameter("tag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String patr_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("patr_chrg_pers")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
String tag = Util.Uni2Ksc(Util.checkString(req.getParameter("tag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setDept_cd(dept_cd);
dm.setDlco_clsf(dlco_clsf);
dm.setDlco_no(dlco_no);
dm.setChrg_pers(chrg_pers);
dm.setPatr_chrg_pers(patr_chrg_pers);
dm.setTitl(titl);
dm.setCont(cont);
dm.setTag(tag);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 25 14:31:49 KST 2012 */