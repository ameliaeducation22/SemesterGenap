package UAS_SDL;

public class Main {
    public static void main(String[] args) {
        TicketQueue queue = new TicketQueue();
        StatusStack riwayat = new StatusStack();

        Ticket tiket1 = new Ticket("T001", "Amelia", "Tiket tidak muncul", "Menunggu", 24);
        Ticket tiket2 = new Ticket("T002", "Budi", "Aplikasi error", "Menunggu", 25);
        Ticket tiket3 = new Ticket("T003", "Andi", "Tidak bisa login", "Menunggu", 15);

        queue.enqueue(tiket1);
        queue.enqueue(tiket2);
        queue.enqueue(tiket3);

        System.out.println("=== DAFTAR TIKET ===");
        queue.tampilSemuaTicket();

        //INI KUTAMBAH BUAT NAMPILIN TIKET PALING PRIORITAS========================================================
        System.out.println("\n=== TIKET PALING DEPAN ===");
        queue.peek();

        System.out.println("\n=== MEMPROSES TIKET ===");
        Ticket diproses = queue.dequeue();
        //========================================================================================================

        if (diproses != null) {
            riwayat.push(new Status(diproses.getStatus()));
            diproses.UpdateStatus("Diproses");
            riwayat.push(new Status("Diproses"));
            diproses.tampilTiket();
        }

        //INI KUTAMBAH BUAT IMPLEMENTASI ROLLBACK============================================================
        System.out.println("\n=== ROLLBACK STATUS ===");
        riwayat.pop();
        Status previous = riwayat.pop();

        if (previous != null) {
            diproses.setStatus(previous.toString());
            System.out.println(
                    "Status berhasil dikembalikan ke : "
                            + previous
            );
        }
        //============================================================================================

        //INI KUTAMBAH BUAT IMPLEMENTASI PENCARIAN TIKET======================================================
        System.out.println("\n=== PENCARIAN TIKET ===");
        Ticket hasil = queue.cariTicket("T002");
        if (hasil != null) {
            hasil.tampilTiket();
        } else {
            System.out.println("Tiket tidak ditemukan");
        }
        //============================================================================================

        //INI KUTAMBAH BUAT IMPLEMENTASI LAPORAN TIKET BIAR ADA ADA DATA DI AKHIR======================================
        queue.laporanTiket();
        System.out.println("\n=== STATUS TIKET ===");
        tiket1.tampilStatus();
        tiket2.tampilStatus();
        tiket3.tampilStatus();
        System.out.println("\nProgram selesai.");
        //=============================================================================================================
    }
}