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


package chosun.ciis.ad.bas.rec;


/**
 * 
 */


public class AD_BAS_3120_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String pubc_dt;
	public String wkdy;
	public String tot_pcnt;
	public String tot_cell;
	public String clr_cell;
	public String asum_pubc_amt;
	public String advt_ocpy_rate;
	public String diff_amt;

	public AD_BAS_3120_LCURLIST1Record(){}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setWkdy(String wkdy){
		this.wkdy = wkdy;
	}

	public void setTot_pcnt(String tot_pcnt){
		this.tot_pcnt = tot_pcnt;
	}

	public void setTot_cell(String tot_cell){
		this.tot_cell = tot_cell;
	}

	public void setClr_cell(String clr_cell){
		this.clr_cell = clr_cell;
	}

	public void setAsum_pubc_amt(String asum_pubc_amt){
		this.asum_pubc_amt = asum_pubc_amt;
	}

	public void setAdvt_ocpy_rate(String advt_ocpy_rate){
		this.advt_ocpy_rate = advt_ocpy_rate;
	}

	public void setDiff_amt(String diff_amt){
		this.diff_amt = diff_amt;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getWkdy(){
		return this.wkdy;
	}

	public String getTot_pcnt(){
		return this.tot_pcnt;
	}

	public String getTot_cell(){
		return this.tot_cell;
	}

	public String getClr_cell(){
		return this.clr_cell;
	}

	public String getAsum_pubc_amt(){
		return this.asum_pubc_amt;
	}

	public String getAdvt_ocpy_rate(){
		return this.advt_ocpy_rate;
	}

	public String getDiff_amt(){
		return this.diff_amt;
	}
}

/* 작성시간 : Mon Apr 20 16:41:03 KST 2009 */