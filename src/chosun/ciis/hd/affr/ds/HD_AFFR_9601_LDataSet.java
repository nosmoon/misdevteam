package chosun.ciis.hd.affr.ds;

import chosun.ciis.hd.affr.rec.HD_AFFR_9601_LCURLISTRecord;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import somo.framework.db.BaseDataSet;
import somo.framework.util.Util;

public class HD_AFFR_9601_LDataSet extends BaseDataSet
  implements Serializable
{
  public ArrayList curlist = new ArrayList();
  public String errcode;
  public String errmsg;

  public HD_AFFR_9601_LDataSet()
  {
  }

  public HD_AFFR_9601_LDataSet(String paramString1, String paramString2)
  {
    this.errcode = paramString1;
    this.errmsg = paramString2;
  }

  public void setErrcode(String paramString) {
    this.errcode = paramString;
  }

  public void setErrmsg(String paramString) {
    this.errmsg = paramString;
  }

  public String getErrcode() {
    return this.errcode;
  }

  public String getErrmsg() {
    return this.errmsg;
  }

  public void getValues(CallableStatement paramCallableStatement) throws SQLException {
    this.errcode = Util.checkString(paramCallableStatement.getString(1));
    this.errmsg = Util.checkString(paramCallableStatement.getString(2));
    if (!"".equals(this.errcode)) {
      return;
    }

    ResultSet localResultSet = (ResultSet)paramCallableStatement.getObject(8);
    while (localResultSet.next()) {
    	
      HD_AFFR_9601_LCURLISTRecord localHD_AFFR_9601_LCURLISTRecord = new HD_AFFR_9601_LCURLISTRecord();
      localHD_AFFR_9601_LCURLISTRecord.cmpy_cd = Util.checkString(localResultSet.getString("cmpy_cd"));
      localHD_AFFR_9601_LCURLISTRecord.mang_no = Util.checkString(localResultSet.getString("mang_no"));
      localHD_AFFR_9601_LCURLISTRecord.seq = Util.checkString(localResultSet.getString("seq"));
      localHD_AFFR_9601_LCURLISTRecord.flnm = Util.checkString(localResultSet.getString("flnm"));
      localHD_AFFR_9601_LCURLISTRecord.memb_clsf = Util.checkString(localResultSet.getString("memb_clsf"));
      localHD_AFFR_9601_LCURLISTRecord.memb_clsf_nm = Util.checkString(localResultSet.getString("memb_clsf_nm"));
      localHD_AFFR_9601_LCURLISTRecord.aply_obj_clsf = Util.checkString(localResultSet.getString("aply_obj_clsf"));
      localHD_AFFR_9601_LCURLISTRecord.aply_obj_name = Util.checkString(localResultSet.getString("aply_obj_name"));
      localHD_AFFR_9601_LCURLISTRecord.expn_clsf_cd = Util.checkString(localResultSet.getString("expn_clsf_cd"));
      localHD_AFFR_9601_LCURLISTRecord.expn_clsf_nm = Util.checkString(localResultSet.getString("expn_clsf_nm"));
      localHD_AFFR_9601_LCURLISTRecord.expn_cont = Util.checkString(localResultSet.getString("expn_cont"));
      localHD_AFFR_9601_LCURLISTRecord.str_dt = Util.checkString(localResultSet.getString("str_dt"));
      localHD_AFFR_9601_LCURLISTRecord.end_dt = Util.checkString(localResultSet.getString("end_dt"));
      localHD_AFFR_9601_LCURLISTRecord.limt_amt = Util.checkString(localResultSet.getString("limt_amt"));
      localHD_AFFR_9601_LCURLISTRecord.clam_amt = Util.checkString(localResultSet.getString("clam_amt"));
      localHD_AFFR_9601_LCURLISTRecord.excl_amt = Util.checkString(localResultSet.getString("excl_amt"));
      localHD_AFFR_9601_LCURLISTRecord.sply_amt = Util.checkString(localResultSet.getString("sply_amt"));
      localHD_AFFR_9601_LCURLISTRecord.bank_cd = Util.checkString(localResultSet.getString("bank_cd"));
      localHD_AFFR_9601_LCURLISTRecord.bank_nm = Util.checkString(localResultSet.getString("bank_nm"));
      localHD_AFFR_9601_LCURLISTRecord.acct_no = Util.checkString(localResultSet.getString("acct_no"));
      localHD_AFFR_9601_LCURLISTRecord.deps_per = Util.checkString(localResultSet.getString("deps_per"));
      localHD_AFFR_9601_LCURLISTRecord.reg_dt = Util.checkString(localResultSet.getString("reg_dt"));
      localHD_AFFR_9601_LCURLISTRecord.pay_dt = Util.checkString(localResultSet.getString("pay_dt"));
      localHD_AFFR_9601_LCURLISTRecord.stlm_desty = Util.checkString(localResultSet.getString("stlm_desty"));
      localHD_AFFR_9601_LCURLISTRecord.dtynm = Util.checkString(localResultSet.getString("dtynm"));
      localHD_AFFR_9601_LCURLISTRecord.tel_no = Util.checkString(localResultSet.getString("tel_no"));
      localHD_AFFR_9601_LCURLISTRecord.proc_mang_dt_seq = Util.checkString(localResultSet.getString("proc_mang_dt_seq"));
      localHD_AFFR_9601_LCURLISTRecord.remk = Util.checkString(localResultSet.getString("remk"));
      localHD_AFFR_9601_LCURLISTRecord.proc_stat = Util.checkString(localResultSet.getString("proc_stat"));
      localHD_AFFR_9601_LCURLISTRecord.proc_stat_nm = Util.checkString(localResultSet.getString("proc_stat_nm"));
      localHD_AFFR_9601_LCURLISTRecord.expn_resn_cd1 = Util.checkString(localResultSet.getString("expn_resn_cd1"));
      localHD_AFFR_9601_LCURLISTRecord.expn_resn_cd2 = Util.checkString(localResultSet.getString("expn_resn_cd2"));
      localHD_AFFR_9601_LCURLISTRecord.expn_resn_cd3 = Util.checkString(localResultSet.getString("expn_resn_cd3"));
      localHD_AFFR_9601_LCURLISTRecord.spos_name = Util.checkString(localResultSet.getString("spos_name"));
      localHD_AFFR_9601_LCURLISTRecord.incmg_pers = Util.checkString(localResultSet.getString("incmg_pers"));
      localHD_AFFR_9601_LCURLISTRecord.incmg_dt_tm = Util.checkString(localResultSet.getString("incmg_dt_tm"));
      localHD_AFFR_9601_LCURLISTRecord.chg_pers = Util.checkString(localResultSet.getString("chg_pers"));
      localHD_AFFR_9601_LCURLISTRecord.chg_dt_tm = Util.checkString(localResultSet.getString("chg_dt_tm"));
      localHD_AFFR_9601_LCURLISTRecord.proc_mang_dt = Util.checkString(localResultSet.getString("proc_mang_dt"));
      localHD_AFFR_9601_LCURLISTRecord.proc_mang_seq = Util.checkString(localResultSet.getString("proc_mang_seq"));
      this.curlist.add(localHD_AFFR_9601_LCURLISTRecord);
    }
  }
}