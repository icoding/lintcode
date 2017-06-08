//package com.jndemo.demo.utils;
//
//
//import net.sourceforge.pinyin4j.PinyinHelper;
//import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
//import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
//import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
//import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
//import org.apache.commons.codec.digest.DigestUtils;
//import org.apache.commons.lang.StringUtils;
//import org.apache.commons.lang.math.RandomUtils;
//
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.util.UUID;
//
///**
// * 各种码 生成util
// * @author jiangnan_bi
// *
// */
//public class MachineCodeUtils {
//    private static String profile;
//
//    public static String getProfile() {
//        return profile;
//    }
//
//    public static void setProfile(String profile) {
//        MachineCodeUtils.profile = profile;
//    }
//
//    /**
//	 * 创建uid
//	 * @param uid
//	 * @return
//	 */
//	public static String createUid(int uid){
//		StringBuilder bu = new StringBuilder();
//		int key = getRandomKey();
//		bu.append(key);
//		bu.append("|");
//		bu.append(uid);
//		bu.append("|");
//		bu.append(MachineCodeUtils.toMd5String(uid+"jiangnan"+key));
//		System.out.println(bu.toString());
//		return bu.toString();
//	}
//
//	/**
//	 * 检查userkey 是否符合规则
//	 * @param userKey
//	 * @return
//	 */
//	public static int checkUid(String userKey){
//		if(StringUtils.isBlank(userKey)){
//			return -1;
//		}
//		String keys[] = userKey.split("\\|");
//		if(keys.length!=3){
//			return -1;
//		}
//		String checkCode = keys[2];
//		if(checkCode.equals(MachineCodeUtils.toMd5String(keys[1]+"jiangnan"+keys[0]))){
//			try {
//				return Integer.valueOf(keys[1]);
//
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		return -1;
//	}
//	private static int getRandomKey(){
//		return (int)Math.rint(Math.random()*(99999-10000)+10000);
//	}
//	/**
//	 * 创建uuid
//	 * @return
//	 */
//	public static String createUUID(){
//		UUID uuid = UUID.randomUUID();
//		return uuid.toString();
//	}
//	/**
//	 * 生成MD5
//	 * @param str
//	 * @return
//	 */
//	public static String toMd5String(String str) {
//		String key = "";
//		try {
//			MessageDigest md = MessageDigest.getInstance("MD5");
//			md.update(str.getBytes());
//			key = bytesToHexString(md.digest());
//		} catch (NoSuchAlgorithmException e) {
//			e.printStackTrace();
//		}
//		return key;
//
//	}
//	private static String bytesToHexString(byte [] bt) {
//		 StringBuffer sb = new StringBuffer(bt.length);
//	     String sTemp;
//	        for (int i = 0; i < bt.length; i++) {
//	            sTemp = Integer.toHexString(0xFF & bt[i]);
//	            if (sTemp.length() < 2)
//	                sb.append(0);
//	            sb.append(sTemp.toUpperCase());
//	        }
//	        return sb.toString();
//	}
//	/**
//	 * 各种随机范围
//	 * @param max
//	 * @param min
//	 * @return
//	 */
//	public static int randomRange(int max, int min) {
//        int s = RandomUtils.nextInt(max) % (max - min + 1) + min;
//        return s;
//	}
//	public static String getFirstSpell(String chinese) {
//		StringBuffer pybf = new StringBuffer();
//		char[] arr = chinese.toCharArray();
//		HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
//		defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
//		defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > 128) {
//				try {
//					String[] temp = PinyinHelper.toHanyuPinyinStringArray(arr[i], defaultFormat);
//					if (temp != null) {
//						pybf.append(temp[0].charAt(0));
//					}
//				} catch (BadHanyuPinyinOutputFormatCombination e) {
//					e.printStackTrace();
//				}
//			} else {
//				pybf.append(arr[i]);
//			}
//		}
//		return pybf.toString().replaceAll("\\W", "").trim();
//	}
//	private static final char[] chars = {'a', 'c', 'd', 'e', 'f', 'g',
//			'h', 'i', 'j', 'k', 'm', 'n', 'p', 'r', 't', 'w', 'x', 'y', '2',
//			'3', '4', '5',  '7', '8', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
//			'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'T',  'W', 'X',
//			'Y'};
//	private static final int[] numberchars = {1,2,3,4,5,6,7,8,9,0};
//
//	public static String getCode(int length) {
//		StringBuilder sb = new StringBuilder(length);
//		for (int i = 0; i < length; i++) {
//			sb.append(RandomUtils.nextInt(numberchars.length));
//		}
//		return sb.toString();
//	}
//	public static void main(String[] args) {
//		System.out.println(MachineCodeUtils.toMd5String("123"));
//		System.out.println(DigestUtils.md5Hex("123"));
//	}
//}
