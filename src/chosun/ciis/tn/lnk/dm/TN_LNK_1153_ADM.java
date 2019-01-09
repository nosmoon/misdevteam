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


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_1153_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_idx;
	public String excl_type;
	public String title;
	public String flag;
	public String excl_pmnt_idx;
	public String add_file_nm;
	public String add_file_size;
	public byte[] add_file;
	public String mode;
	public String row_num;
	public String memb_nm;
	public String prms_cd;
	public String pay_dt;
	public String pay_amt;
	public String bank_acct_cd;
	public String pmnt_memo;
	public String incmg_pers_ip;
	public String incmg_pers;

	public TN_LNK_1153_ADM(){}
	public TN_LNK_1153_ADM(String cmpy_cd, String dept_idx, String excl_type, String title, String flag, String excl_pmnt_idx, String add_file_nm, String add_file_size, byte[] add_file, String mode, String row_num, String memb_nm, String prms_cd, String pay_dt, String pay_amt, String bank_acct_cd, String pmnt_memo, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.dept_idx = dept_idx;
		this.excl_type = excl_type;
		this.title = title;
		this.flag = flag;
		this.excl_pmnt_idx = excl_pmnt_idx;
		this.add_file_nm = add_file_nm;
		this.add_file_size = add_file_size;
		this.add_file = add_file;
		this.mode = mode;
		this.row_num = row_num;
		this.memb_nm = memb_nm;
		this.prms_cd = prms_cd;
		this.pay_dt = pay_dt;
		this.pay_amt = pay_amt;
		this.bank_acct_cd = bank_acct_cd;
		this.pmnt_memo = pmnt_memo;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_idx(String dept_idx){
		this.dept_idx = dept_idx;
	}

	public void setExcl_type(String excl_type){
		this.excl_type = excl_type;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setExcl_pmnt_idx(String excl_pmnt_idx){
		this.excl_pmnt_idx = excl_pmnt_idx;
	}

	public void setAdd_file_nm(String add_file_nm){
		this.add_file_nm = add_file_nm;
	}

	public void setAdd_file_size(String add_file_size){
		this.add_file_size = add_file_size;
	}

	public void setAdd_file(byte[] add_file){
		this.add_file = add_file;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setRow_num(String row_num){
		this.row_num = row_num;
	}

	public void setMemb_nm(String memb_nm){
		this.memb_nm = memb_nm;
	}

	public void setPrms_cd(String prms_cd){
		this.prms_cd = prms_cd;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setBank_acct_cd(String bank_acct_cd){
		this.bank_acct_cd = bank_acct_cd;
	}

	public void setPmnt_memo(String pmnt_memo){
		this.pmnt_memo = pmnt_memo;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_idx(){
		return this.dept_idx;
	}

	public String getExcl_type(){
		return this.excl_type;
	}

	public String getTitle(){
		return this.title;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getExcl_pmnt_idx(){
		return this.excl_pmnt_idx;
	}

	public String getAdd_file_nm(){
		return this.add_file_nm;
	}

	public String getAdd_file_size(){
		return this.add_file_size;
	}

	public byte[] getAdd_file(){
		return this.add_file;
	}

	public String getMode(){
		return this.mode;
	}

	public String getRow_num(){
		return this.row_num;
	}

	public String getMemb_nm(){
		return this.memb_nm;
	}

	public String getPrms_cd(){
		return this.prms_cd;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getBank_acct_cd(){
		return this.bank_acct_cd;
	}

	public String getPmnt_memo(){
		return this.pmnt_memo;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_1153_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_1153_ADM dm = (TN_LNK_1153_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_idx);
		cstmt.setString(5, dm.excl_type);
		cstmt.setString(6, dm.title);
		cstmt.setString(7, dm.flag);
		cstmt.setString(8, dm.excl_pmnt_idx);
		cstmt.setString(9, dm.add_file_nm);
		cstmt.setString(10, dm.add_file_size);
		cstmt.setBytes(11, "0101".getBytes());
		cstmt.setString(12, dm.mode);
		cstmt.setString(13, dm.row_num);
		cstmt.setString(14, dm.memb_nm);
		cstmt.setString(15, dm.prms_cd);
		cstmt.setString(16, dm.pay_dt);
		cstmt.setString(17, dm.pay_amt);
		cstmt.setString(18, dm.bank_acct_cd);
		cstmt.setString(19, dm.pmnt_memo);
		cstmt.setString(20, dm.incmg_pers_ip);
		cstmt.setString(21, dm.incmg_pers);
		cstmt.registerOutParameter(22, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_1153_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_idx = [" + getDept_idx() + "]");
		System.out.println("excl_type = [" + getExcl_type() + "]");
		System.out.println("title = [" + getTitle() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("excl_pmnt_idx = [" + getExcl_pmnt_idx() + "]");
		System.out.println("add_file_nm = [" + getAdd_file_nm() + "]");
		System.out.println("add_file_size = [" + getAdd_file_size() + "]");
		System.out.println("add_file = [" + getAdd_file() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("row_num = [" + getRow_num() + "]");
		System.out.println("memb_nm = [" + getMemb_nm() + "]");
		System.out.println("prms_cd = [" + getPrms_cd() + "]");
		System.out.println("pay_dt = [" + getPay_dt() + "]");
		System.out.println("pay_amt = [" + getPay_amt() + "]");
		System.out.println("bank_acct_cd = [" + getBank_acct_cd() + "]");
		System.out.println("pmnt_memo = [" + getPmnt_memo() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String dept_idx = req.getParameter("dept_idx");
if( dept_idx == null){
	System.out.println(this.toString+" : dept_idx is null" );
}else{
	System.out.println(this.toString+" : dept_idx is "+dept_idx );
}
String excl_type = req.getParameter("excl_type");
if( excl_type == null){
	System.out.println(this.toString+" : excl_type is null" );
}else{
	System.out.println(this.toString+" : excl_type is "+excl_type );
}
String title = req.getParameter("title");
if( title == null){
	System.out.println(this.toString+" : title is null" );
}else{
	System.out.println(this.toString+" : title is "+title );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String excl_pmnt_idx = req.getParameter("excl_pmnt_idx");
if( excl_pmnt_idx == null){
	System.out.println(this.toString+" : excl_pmnt_idx is null" );
}else{
	System.out.println(this.toString+" : excl_pmnt_idx is "+excl_pmnt_idx );
}
String add_file_nm = req.getParameter("add_file_nm");
if( add_file_nm == null){
	System.out.println(this.toString+" : add_file_nm is null" );
}else{
	System.out.println(this.toString+" : add_file_nm is "+add_file_nm );
}
String add_file_size = req.getParameter("add_file_size");
if( add_file_size == null){
	System.out.println(this.toString+" : add_file_size is null" );
}else{
	System.out.println(this.toString+" : add_file_size is "+add_file_size );
}
String add_file = req.getParameter("add_file");
if( add_file == null){
	System.out.println(this.toString+" : add_file is null" );
}else{
	System.out.println(this.toString+" : add_file is "+add_file );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String row_num = req.getParameter("row_num");
if( row_num == null){
	System.out.println(this.toString+" : row_num is null" );
}else{
	System.out.println(this.toString+" : row_num is "+row_num );
}
String memb_nm = req.getParameter("memb_nm");
if( memb_nm == null){
	System.out.println(this.toString+" : memb_nm is null" );
}else{
	System.out.println(this.toString+" : memb_nm is "+memb_nm );
}
String prms_cd = req.getParameter("prms_cd");
if( prms_cd == null){
	System.out.println(this.toString+" : prms_cd is null" );
}else{
	System.out.println(this.toString+" : prms_cd is "+prms_cd );
}
String pay_dt = req.getParameter("pay_dt");
if( pay_dt == null){
	System.out.println(this.toString+" : pay_dt is null" );
}else{
	System.out.println(this.toString+" : pay_dt is "+pay_dt );
}
String pay_amt = req.getParameter("pay_amt");
if( pay_amt == null){
	System.out.println(this.toString+" : pay_amt is null" );
}else{
	System.out.println(this.toString+" : pay_amt is "+pay_amt );
}
String bank_acct_cd = req.getParameter("bank_acct_cd");
if( bank_acct_cd == null){
	System.out.println(this.toString+" : bank_acct_cd is null" );
}else{
	System.out.println(this.toString+" : bank_acct_cd is "+bank_acct_cd );
}
String pmnt_memo = req.getParameter("pmnt_memo");
if( pmnt_memo == null){
	System.out.println(this.toString+" : pmnt_memo is null" );
}else{
	System.out.println(this.toString+" : pmnt_memo is "+pmnt_memo );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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
String dept_idx = Util.checkString(req.getParameter("dept_idx"));
String excl_type = Util.checkString(req.getParameter("excl_type"));
String title = Util.checkString(req.getParameter("title"));
String flag = Util.checkString(req.getParameter("flag"));
String excl_pmnt_idx = Util.checkString(req.getParameter("excl_pmnt_idx"));
String add_file_nm = Util.checkString(req.getParameter("add_file_nm"));
String add_file_size = Util.checkString(req.getParameter("add_file_size"));
String add_file = Util.checkString(req.getParameter("add_file"));
String mode = Util.checkString(req.getParameter("mode"));
String row_num = Util.checkString(req.getParameter("row_num"));
String memb_nm = Util.checkString(req.getParameter("memb_nm"));
String prms_cd = Util.checkString(req.getParameter("prms_cd"));
String pay_dt = Util.checkString(req.getParameter("pay_dt"));
String pay_amt = Util.checkString(req.getParameter("pay_amt"));
String bank_acct_cd = Util.checkString(req.getParameter("bank_acct_cd"));
String pmnt_memo = Util.checkString(req.getParameter("pmnt_memo"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_idx")));
String excl_type = Util.Uni2Ksc(Util.checkString(req.getParameter("excl_type")));
String title = Util.Uni2Ksc(Util.checkString(req.getParameter("title")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String excl_pmnt_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("excl_pmnt_idx")));
String add_file_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_nm")));
String add_file_size = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file_size")));
String add_file = Util.Uni2Ksc(Util.checkString(req.getParameter("add_file")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String row_num = Util.Uni2Ksc(Util.checkString(req.getParameter("row_num")));
String memb_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("memb_nm")));
String prms_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prms_cd")));
String pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt")));
String pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_amt")));
String bank_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_acct_cd")));
String pmnt_memo = Util.Uni2Ksc(Util.checkString(req.getParameter("pmnt_memo")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_idx(dept_idx);
dm.setExcl_type(excl_type);
dm.setTitle(title);
dm.setFlag(flag);
dm.setExcl_pmnt_idx(excl_pmnt_idx);
dm.setAdd_file_nm(add_file_nm);
dm.setAdd_file_size(add_file_size);
dm.setAdd_file(add_file);
dm.setMode(mode);
dm.setRow_num(row_num);
dm.setMemb_nm(memb_nm);
dm.setPrms_cd(prms_cd);
dm.setPay_dt(pay_dt);
dm.setPay_amt(pay_amt);
dm.setBank_acct_cd(bank_acct_cd);
dm.setPmnt_memo(pmnt_memo);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 02 15:18:18 KST 2016 */