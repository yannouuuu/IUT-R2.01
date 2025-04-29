package tpOO.tp07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BidirectionalPhoneBookTest {
    public String s1, s2, s3;
    public String name1, name2, name3;
    public ProPhoneNumber ppn1, ppn2, ppn3, ppn4, ppn5;
    public BidirectionalPhoneBook bpb1;

    @BeforeEach
    void initialization() {
        s1 = "1234";
        s2 = "1111";
        s3 = "2222";
        name1 = "alice";
        name2 = "bruno";
        name3 = "clément";
        ppn1 = new ProPhoneNumber(s1, UniversityDepartment.IUT);
        ppn2 = new ProPhoneNumber(s1, UniversityDepartment.FST);
        ppn3 = new ProPhoneNumber(s2, UniversityDepartment.IUT);
        ppn4 = new ProPhoneNumber(s1, UniversityDepartment.IUT);
        ppn5 = new ProPhoneNumber(s3, UniversityDepartment.IUT);
        bpb1 = new BidirectionalPhoneBook();
    }

    @Test
    void testAdd() {
        assertEquals(0, bpb1.getNbEntries());
        assertTrue(bpb1.add(name1, UniversityDepartment.IUT, s1));
        assertEquals(1, bpb1.getNbEntries());
        assertFalse(bpb1.add(name1, UniversityDepartment.IUT, s1));
        assertEquals(1, bpb1.getNbEntries());
        assertFalse(bpb1.add(name2, UniversityDepartment.IUT, s1));
        assertEquals(1, bpb1.getNbEntries());
        assertFalse(bpb1.add(name1, UniversityDepartment.IUT, s2));
        assertEquals(1, bpb1.getNbEntries());
        assertTrue(bpb1.add(name2, UniversityDepartment.IUT, s2));
        assertEquals(2, bpb1.getNbEntries());
    }

    @Test
    void testAlreadyRegistered() {
        assertEquals(0, bpb1.getNbEntries());
        assertFalse(bpb1.alreadyRegistered(name1));
        assertFalse(bpb1.alreadyRegistered(UniversityDepartment.IUT.getDiallingCode()+s1));
        assertFalse(bpb1.alreadyRegistered(name2));
        assertFalse(bpb1.alreadyRegistered(UniversityDepartment.IUT.getDiallingCode()+s2));
        assertTrue(bpb1.add(name1, UniversityDepartment.IUT, s1));
        assertEquals(1, bpb1.getNbEntries());
        assertTrue(bpb1.alreadyRegistered(name1));
        assertTrue(bpb1.alreadyRegistered(UniversityDepartment.IUT.getDiallingCode()+s1));
        assertFalse(bpb1.alreadyRegistered(name2));
        assertFalse(bpb1.alreadyRegistered(UniversityDepartment.IUT.getDiallingCode()+s2));
        assertTrue(bpb1.add(name2, UniversityDepartment.IUT, s2));
        assertEquals(2, bpb1.getNbEntries());
        assertTrue(bpb1.alreadyRegistered(name1));
        assertTrue(bpb1.alreadyRegistered(UniversityDepartment.IUT.getDiallingCode()+s1));
        assertTrue(bpb1.alreadyRegistered(name2));
        assertTrue(bpb1.alreadyRegistered(UniversityDepartment.IUT.getDiallingCode()+s2));
    }

    @Test
    void testGetProPhoneNumberFromName() {
        assertEquals(0, bpb1.getNbEntries());
        assertNull(bpb1.getProPhoneNumberFromName(name1));
        assertNull(bpb1.getProPhoneNumberFromName(name2));
        assertTrue(bpb1.add(name1, UniversityDepartment.IUT, s1));
        assertEquals(1, bpb1.getNbEntries());
        assertEquals(ppn1, bpb1.getProPhoneNumberFromName(name1));
        assertNull(bpb1.getProPhoneNumberFromName(name2));
        assertTrue(bpb1.add(name2, UniversityDepartment.FST, s1));
        assertEquals(2, bpb1.getNbEntries());
        assertEquals(ppn1, bpb1.getProPhoneNumberFromName(name1));
        assertEquals(ppn2, bpb1.getProPhoneNumberFromName(name2));
    }

    @Test
    void testGetNameFromFiveDigits() {
        assertEquals(0, bpb1.getNbEntries());
        assertNull(bpb1.getNameFromFiveDigits(UniversityDepartment.IUT.getDiallingCode()+s1));
        assertNull(bpb1.getNameFromFiveDigits(UniversityDepartment.FST.getDiallingCode()+s1));
        assertTrue(bpb1.add(name1, UniversityDepartment.IUT, s1));
        assertEquals(1, bpb1.getNbEntries());
        assertEquals(name1, bpb1.getNameFromFiveDigits(UniversityDepartment.IUT.getDiallingCode()+s1));
        assertNull(bpb1.getNameFromFiveDigits(UniversityDepartment.FST.getDiallingCode()+s1));
        assertTrue(bpb1.add(name2, UniversityDepartment.FST, s1));
        assertEquals(2, bpb1.getNbEntries());
        assertEquals(name1, bpb1.getNameFromFiveDigits(UniversityDepartment.IUT.getDiallingCode()+s1));
        assertEquals(name2, bpb1.getNameFromFiveDigits(UniversityDepartment.FST.getDiallingCode()+s1));
    }

    @Test
    void testListing() {
        String resultIUT = UniversityDepartment.IUT.getLabelLong() + System.getProperty("line.separator");
        String resultFST = UniversityDepartment.FST.getLabelLong() + System.getProperty("line.separator");
        String resultFH = UniversityDepartment.FH.getLabelLong() + System.getProperty("line.separator");
        assertEquals(0, bpb1.getNbEntries());
        assertEquals(resultIUT, bpb1.listing(UniversityDepartment.IUT));
        assertEquals(resultFST, bpb1.listing(UniversityDepartment.FST));
        assertEquals(resultFH, bpb1.listing(UniversityDepartment.FH));
        assertTrue(bpb1.add(name1, UniversityDepartment.IUT, s1));
        resultIUT += name1 + ":" + ppn1.internToString() + System.getProperty("line.separator");
        assertEquals(1, bpb1.getNbEntries());
        assertEquals(resultIUT, bpb1.listing(UniversityDepartment.IUT));
        assertEquals(resultFST, bpb1.listing(UniversityDepartment.FST));
        assertEquals(resultFH, bpb1.listing(UniversityDepartment.FH));
        assertTrue(bpb1.add(name2, UniversityDepartment.FST, s1));
        resultFST += name2 + ":" + ppn2.internToString() + System.getProperty("line.separator");
        assertEquals(2, bpb1.getNbEntries());
        assertEquals(resultIUT, bpb1.listing(UniversityDepartment.IUT));
        assertEquals(resultFST, bpb1.listing(UniversityDepartment.FST));
        assertEquals(resultFH, bpb1.listing(UniversityDepartment.FH));
        assertTrue(bpb1.add(name3, UniversityDepartment.IUT, s3));
        resultIUT = UniversityDepartment.IUT.getLabelLong() + System.getProperty("line.separator")+ name3 + ":" + ppn5.internToString() + System.getProperty("line.separator") + name1 + ":" + ppn1.internToString() + System.getProperty("line.separator");
        assertEquals(3, bpb1.getNbEntries());
        assertEquals(resultIUT, bpb1.listing(UniversityDepartment.IUT));
        assertEquals(resultFST, bpb1.listing(UniversityDepartment.FST));
        assertEquals(resultFH, bpb1.listing(UniversityDepartment.FH));
    }

    @Test
    void testListing2() {
        // empty listing
        String result = "";
        for(int i=0; i<UniversityDepartment.values().length; i++) {
            UniversityDepartment ud = UniversityDepartment.values()[i];
            result += ud.getLabelLong() + System.getProperty("line.separator");
        }
        assertEquals(0, bpb1.getNbEntries());
        assertEquals(result, bpb1.listing());
        // first addition (IUT)
        assertTrue(bpb1.add(name1, UniversityDepartment.IUT, s1));
        {result = "";
        for(int i=0; i<UniversityDepartment.IUT.ordinal(); i++) {
            UniversityDepartment ud = UniversityDepartment.values()[i];
            result += ud.getLabelLong() + System.getProperty("line.separator");
        }
        result += UniversityDepartment.IUT.getLabelLong() + System.getProperty("line.separator");
        result += name1 + ":" + ppn1.internToString() + System.getProperty("line.separator");
        for(int i=UniversityDepartment.IUT.ordinal()+1; i<UniversityDepartment.values().length; i++) {
            UniversityDepartment ud = UniversityDepartment.values()[i];
            result += ud.getLabelLong() + System.getProperty("line.separator");
        }}
        assertEquals(1, bpb1.getNbEntries());
        assertEquals(result, bpb1.listing());
        // second addition (FST)
        assertTrue(bpb1.add(name2, UniversityDepartment.FST, s1));
        {result = "";
        for(int i=0; i<UniversityDepartment.FST.ordinal(); i++) {
            UniversityDepartment ud = UniversityDepartment.values()[i];
            result += ud.getLabelLong() + System.getProperty("line.separator");
        }
        result += UniversityDepartment.FST.getLabelLong() + System.getProperty("line.separator");
        result += name2 + ":" + ppn2.internToString() + System.getProperty("line.separator");
        result += UniversityDepartment.IUT.getLabelLong() + System.getProperty("line.separator");
        result += name1 + ":" + ppn1.internToString() + System.getProperty("line.separator");
        for(int i=UniversityDepartment.IUT.ordinal()+1; i<UniversityDepartment.values().length; i++) {
            UniversityDepartment ud = UniversityDepartment.values()[i];
            result += ud.getLabelLong() + System.getProperty("line.separator");
        }}
        assertEquals(2, bpb1.getNbEntries());
        assertEquals(result, bpb1.listing());
        // third addition (IUT)
        assertTrue(bpb1.add(name3, UniversityDepartment.IUT, s3));
        {result = "";
        for(int i=0; i<UniversityDepartment.FST.ordinal(); i++) {
            UniversityDepartment ud = UniversityDepartment.values()[i];
            result += ud.getLabelLong() + System.getProperty("line.separator");
        }
        result += UniversityDepartment.FST.getLabelLong() + System.getProperty("line.separator");
        result += name2 + ":" + ppn2.internToString() + System.getProperty("line.separator");
        result += UniversityDepartment.IUT.getLabelLong() + System.getProperty("line.separator");
        result += name3 + ":" + ppn5.internToString() + System.getProperty("line.separator");
        result += name1 + ":" + ppn1.internToString() + System.getProperty("line.separator");
        for(int i=UniversityDepartment.IUT.ordinal()+1; i<UniversityDepartment.values().length; i++) {
            UniversityDepartment ud = UniversityDepartment.values()[i];
            result += ud.getLabelLong() + System.getProperty("line.separator");
        }}
        assertEquals(3, bpb1.getNbEntries());
        assertEquals(result, bpb1.listing());
    }
}
