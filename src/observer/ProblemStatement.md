# Patient Vital Monitor

You are building a CLI based patient monitoring system for a hospital.

A patient has the following 3 vitals that are continuously monitored:

1. **Heart Rate** — measured in bpm. Normal range: 60–100 bpm.

2. **Blood Pressure** — measured in mmHg. Normal range: 80–120 mmHg.

3. **Blood Sugar** — measured in mg/dL. Normal range: 70–140 mg/dL.

When any vital value changes, the following three devices must be notified automatically:

1. **Bedside Monitor** — displays all current vitals of the patient in real time whenever any value changes.

2. **Nurse Station Display** — prints an alert message when any vital goes outside the normal range.

3. **Doctor Pager** — prints a critical alert when any vital goes outside the normal range. Since this is a CLI application, print the appropriate message to the console.

New devices may be added in the future. The patient vitals system should not need to change when a new device is added.